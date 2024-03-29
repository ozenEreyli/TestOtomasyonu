package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args){

        try {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("https://demoqa.com/elements");

            driver.findElement(By.xpath("//*[@id='item-4']")).click();

            WebElement clickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
            clickMeBtn.click();

            WebElement messageElement = driver.findElement(By.xpath("//*[@id='dynamicClickMessage']"));
            String message = messageElement.getText();
            System.out.println(message);

            driver.quit();

            System.out.println("Test başarılı :)");
        }
        catch (Exception exception){

            System.out.println(exception.getMessage());
        }
    }
}
