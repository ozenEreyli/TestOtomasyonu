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

            driver.findElement(By.cssSelector("#item-4")).click();

            driver.findElement(By.cssSelector("#app > div > div > div > " +
                    "div.col-12.mt-4.col-md-6 > div:nth-child(2) > " +
                    "div:nth-child(4) > button:nth-child(1) ")).click();

            WebElement messageElement = driver.findElement(By.cssSelector("#dynamicClickMessage"));
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
