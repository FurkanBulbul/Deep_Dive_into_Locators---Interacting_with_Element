package Interacting_with_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/dropdown.html");
        System.out.println(driver.findElement(
                By.cssSelector("input#cb_red")).isSelected()
        );
//input#cb_green
        System.out.println(driver.findElement(
                By.cssSelector("input#cb_green")).isSelected()
        );
    }
}
