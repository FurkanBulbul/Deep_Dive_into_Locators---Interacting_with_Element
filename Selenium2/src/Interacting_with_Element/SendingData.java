package Interacting_with_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingData {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // input[name='first_name']
        // input[name='last_name']
        // input[name='email']
        // textarea[name='message']
        driver.get(" https://automationtesting.co.uk/contactForm.html");

        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("John");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Smith");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("johnsmith@test.com");
        driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("This is a message.");





    }
}
