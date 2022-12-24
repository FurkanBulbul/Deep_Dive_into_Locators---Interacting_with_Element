package Interacting_with_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://automationtesting.co.uk/buttons.html");
        System.out.println(driver.findElement(
                By.cssSelector("button#btn_four")).isEnabled()
        );

        System.out.println(driver.findElement(
                By.cssSelector("button#btn_three")).isEnabled()
        );
    }
}
