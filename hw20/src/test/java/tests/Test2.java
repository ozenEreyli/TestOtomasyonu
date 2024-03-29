package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    public static void main(String[] args){

        try {

            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

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

            driver.quit();

            System.out.println("Test başarılı :)");

        }
        catch (Exception exception){

            System.out.println(exception.getMessage());

        }
    }
}
