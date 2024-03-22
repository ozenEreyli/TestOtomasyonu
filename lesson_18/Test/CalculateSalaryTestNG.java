package org.rd.lessons.lesson18;

import org.rd.ta.sample.lesson_18.CalculateSalary;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CalculateSalaryTestNG {
    private final CalculateSalary calculateSalary = new CalculateSalary();

    @BeforeTest
    public void BeforeUnitTestNG(){
        System.out.println("Test öncesi hazırlık :)");
    }

    @Test (groups = "TestNG")
    public void UnitTestNG(){
        Assert.assertEquals(9800, calculateSalary.Calculate(29));
    }

    @Test (groups = "TestNG")
    public void UnitTestNG2(){

        Assert.assertEquals(11000, calculateSalary.Calculate(30));
    }

    @AfterTest
    public void AfterUnitTestNG(){
        System.out.println("Test sonrası çıktı :)");
    }
}
