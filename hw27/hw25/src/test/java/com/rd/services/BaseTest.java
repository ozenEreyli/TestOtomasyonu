package com.rd.services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;

public class BaseTest {
    RequestSpecification spec;
    @BeforeTest
    public void setup(){
        spec= new RequestSpecBuilder()
                .setBaseUri("https://demoqa.com")
                .addFilters(Arrays.asList(new RequestLoggingFilter() , new ResponseLoggingFilter()))
                .build();
    }
}
