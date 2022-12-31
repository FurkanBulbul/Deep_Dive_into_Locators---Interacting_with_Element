package Interacting_with_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingButtons {
    public static void main(String[] args) {
        
        // system set property added
        System.setProperty("webdriver.chrome.driver",
                "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/buttons.html");
        driver.findElement(By.cssSelector("button#btn_three")).click();



    }
}
