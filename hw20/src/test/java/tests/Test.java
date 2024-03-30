package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test {
    private final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void BeforeTestNG()
    {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    }

    @org.testng.annotations.Test(groups = "TestNG")
    public void TestNG1()
    {
        try {

            driver.get("https://demoqa.com/elements");

            driver.findElement(By.cssSelector("#item-4")).click();

            driver.findElement(By.cssSelector("#app > div > div > div > " +
                    "div.col-12.mt-4.col-md-6 > div:nth-child(2) > " +
                    "div:nth-child(4) > button:nth-child(1) ")).click();

            WebElement messageElement = driver.findElement(By.cssSelector("#dynamicClickMessage"));
            String message = messageElement.getText();
            System.out.println(message);

        }
        catch (Exception exception){

            System.out.println(exception.getMessage());
        }
    }
    @org.testng.annotations.Test(groups = "TestNG")
    public void TestNG2()
    {
        driver.get("https://demoqa.com/webtables");


        driver.findElement(By.cssSelector("#addNewRecordButton")).click();

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

        driver.findElement(By.cssSelector("#submit")).click();

        driver.findElement(By.cssSelector("#edit-record-4 > svg")).click();

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

        driver.findElement(By.cssSelector("#submit")).click();

    }

    @AfterTest
    public void AfterUnitTestNG()
    {
        System.out.println("Test başarılı :)");
        driver.quit();
    }
}
