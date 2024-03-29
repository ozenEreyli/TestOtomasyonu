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

            driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();

            WebElement firstNameInsert = driver.findElement(By.xpath("//*[@id='firstName']"));
            firstNameInsert.click();
            firstNameInsert.sendKeys("Özen");
            WebElement lastNameInsert = driver.findElement(By.xpath("//*[@id='lastName']"));
            lastNameInsert.click();
            lastNameInsert.sendKeys("KARAÇAKIR");
            WebElement userEmailInsert = driver.findElement(By.xpath("//*[@id='userEmail']"));
            userEmailInsert.click();
            userEmailInsert.sendKeys("ozen@gmail.com");
            WebElement ageInsert = driver.findElement(By.xpath("//*[@id='age']"));
            ageInsert.click();
            ageInsert.sendKeys("40");
            WebElement salaryInsert = driver.findElement(By.xpath("//*[@id='salary']"));
            salaryInsert.click();
            salaryInsert.sendKeys("50000");
            WebElement departmentInsert = driver.findElement(By.xpath("//*[@id='department']"));
            departmentInsert.click();
            departmentInsert.sendKeys("Yazılım");

            driver.findElement(By.xpath("//*[@id='submit']")).click();

            //*[@id="edit-record-4"]/svg
            WebElement updateBtn = driver.findElement(By.xpath("//*[@id='edit-record-4']/svg"));
            updateBtn.click();

            WebElement firstNameUpdate = driver.findElement(By.xpath("//*[@id='firstName']"));
            firstNameUpdate.click();
            firstNameUpdate.clear();
            firstNameUpdate.sendKeys("Özen");
            WebElement lastNameUpdate = driver.findElement(By.xpath("//*[@id='lastName']"));
            lastNameUpdate.click();
            lastNameUpdate.clear();
            lastNameUpdate.sendKeys("EREYLİ");
            WebElement userEmailUpdate = driver.findElement(By.xpath("//*[@id='userEmail']"));
            userEmailUpdate.click();
            userEmailUpdate.clear();
            userEmailUpdate.sendKeys("ozenkaracakir@gmail.com");
            WebElement ageUpdate = driver.findElement(By.xpath("//*[@id='age']"));
            ageUpdate.click();
            ageUpdate.clear();
            ageUpdate.sendKeys("39");
            WebElement salaryUpdate = driver.findElement(By.xpath("//*[@id='salary']"));
            salaryUpdate.click();
            salaryUpdate.clear();
            salaryUpdate.sendKeys("60000");
            WebElement departmentUpdate = driver.findElement(By.xpath("//*[@id='department']"));
            departmentUpdate.click();
            departmentUpdate.clear();
            departmentUpdate.sendKeys("Yazılım Geliştirme");

            driver.findElement(By.xpath("//*[@id='submit']")).click();

            driver.quit();

            System.out.println("Test başarılı :)");

        }
        catch (Exception exception){

            System.out.println(exception.getMessage());

        }
    }
}
