package com.rd.tests;

import com.rd.services.UserLogin;
import io.qameta.allure.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("User Management")
@Feature("User Operations")
public class UserTest extends UserLogin {
    @Test(groups = "User credentials")
    @Description("Check User Test")
    @Severity(SeverityLevel.MINOR)
    public void CheckUserTest (){
        Response response = CreateOrCheckUser("seamy02", "Example@123");

        Assert.assertEquals("1204", response.jsonPath().getJsonObject("code"));
        Assert.assertEquals("User exists!", response.jsonPath().getJsonObject("message"));
    }

    @Test (groups = "User credentials")
    @Description("Create User Test")
    @Severity(SeverityLevel.MINOR)
    public void CreateUserTest (){
        Response response = CreateOrCheckUser("seamy03", "Example@123");

        Assert.assertNotNull(response.jsonPath().getJsonObject("userID"));
        Assert.assertNotNull(response.jsonPath().getJsonObject("username"));
    }
}

