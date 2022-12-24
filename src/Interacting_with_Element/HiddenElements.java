package Interacting_with_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://automationtesting.co.uk/hiddenElements.html");
        System.out.println(
                driver.findElement(By.cssSelector("#main [class] p:nth-child(3)")).isDisplayed()
        );

        System.out.println(
                driver.findElement(By.cssSelector("#main .inner [class] p:nth-child(4)")).isDisplayed()
        );



    }
}
