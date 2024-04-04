package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CssTest {
    private final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void BeforeTestNG()
    {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    }

    @Test
    public void TestNG1()
    {
            driver.get("https://demoqa.com/elements");

            driver.findElement(By.cssSelector("#item-4")).click();

            driver.findElement(By.cssSelector(".col-md-6 div:nth-of-type(3) > .btn")).click();

            WebElement messageElement = driver.findElement(By.cssSelector("#dynamicClickMessage"));
            String message = messageElement.getText();
            Assert.assertEquals(message,"You have done a dynamic click");
            System.out.println(message);
    }

    @Test
    public void TestNG2()
    {
        driver.get("https://demoqa.com/webtables");


        driver.findElement(By.cssSelector("button#addNewRecordButton")).click();

        WebElement firstNameInsert = driver.findElement(By.cssSelector("#firstName"));
        firstNameInsert.click();
        firstNameInsert.sendKeys("Özen");
        WebElement lastNameInsert = driver.findElement(By.cssSelector("#lastName"));
        lastNameInsert.click();
        lastNameInsert.sendKeys("KARAÇAKIR");
        WebElement userEmailInsert = driver.findElement(By.cssSelector("#userEmail"));
        userEmailInsert.click();
        userEmailInsert.sendKeys("ozen@gmail.com");
        WebElement ageInsert = driver.findElement(By.cssSelector("#age"));
        ageInsert.click();
        ageInsert.sendKeys("40");
        WebElement salaryInsert = driver.findElement(By.cssSelector("#salary"));
        salaryInsert.click();
        salaryInsert.sendKeys("50000");
        WebElement departmentInsert = driver.findElement(By.cssSelector("#department"));
        departmentInsert.click();
        departmentInsert.sendKeys("Yazılım");

        driver.findElement(By.cssSelector("button#submit")).click();

        driver.findElement(By.cssSelector("span#edit-record-4")).click();

        WebElement firstNameUpdate = driver.findElement(By.cssSelector("#firstName"));
        firstNameUpdate.click();
        firstNameUpdate.clear();
        firstNameUpdate.sendKeys("Özen");
        WebElement lastNameUpdate = driver.findElement(By.cssSelector("#lastName"));
        lastNameUpdate.click();
        lastNameUpdate.clear();
        lastNameUpdate.sendKeys("EREYLİ");
        WebElement userEmailUpdate = driver.findElement(By.cssSelector("#userEmail"));
        userEmailUpdate.click();
        userEmailUpdate.clear();
        userEmailUpdate.sendKeys("ozenkaracakir@gmail.com");
        WebElement ageUpdate = driver.findElement(By.cssSelector("#age"));
        ageUpdate.click();
        ageUpdate.clear();
        ageUpdate.sendKeys("39");
        WebElement salaryUpdate = driver.findElement(By.cssSelector("#salary"));
        salaryUpdate.click();
        salaryUpdate.clear();
        salaryUpdate.sendKeys("60000");
        WebElement departmentUpdate = driver.findElement(By.cssSelector("#department"));
        departmentUpdate.click();
        departmentUpdate.clear();
        departmentUpdate.sendKeys("Yazılım Geliştirme");

        driver.findElement(By.cssSelector("button#submit")).click();

    }

    @AfterTest
    public void AfterUnitTestNG()
    {
        System.out.println("Test başarılı :)");
        driver.quit();
    }
}
