package Deep_Dive_into_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByLtext {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");
        driver.findElement(By.linkText("ACTIONS")).click();
    }

}

