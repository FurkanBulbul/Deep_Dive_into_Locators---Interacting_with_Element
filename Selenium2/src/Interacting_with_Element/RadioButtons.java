package Interacting_with_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://automationtesting.co.uk/dropdown.html");

        driver.findElement(By.cssSelector("[for='demo-priority-low']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[for='demo-priority-normal']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[for='demo-priority-high']")).click();

    }
}
