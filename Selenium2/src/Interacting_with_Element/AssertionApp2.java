package Interacting_with_Element;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionApp2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://teststore.automationtesting.co.uk/");

        driver.findElement(By.cssSelector("[alt='Hummingbird printed t-shirt']")).click();
        driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();
        Thread.sleep(2000);
      String total = driver.findElement(By.cssSelector(".product-total > .value")).getText();

       Assert.assertEquals("$26.12",total);

    }
}
