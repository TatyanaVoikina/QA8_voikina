import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class JUnitAnnotations2 {
    WebDriver driver;

    @Before
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://office-prestige.com.ua/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.findElement(By.className("btn-log")).click();
        Thread.sleep(3000);
        System.out.println("--->кнопка нажата<---");
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/div/div/button")).click();
        Thread.sleep(3000);
        System.out.println("--->кнопка нажата<---");
    }

    @Test
    public void testErrorRegistrationTest () throws InterruptedException {
        driver.findElement(By.id("firstname")).sendKeys("Tatyana");
        System.out.println("--->поле заполнено<---");
        driver.findElement(By.id("lastname")).sendKeys("Voikina");
        System.out.println("--->поле заполнено<---");
        driver.findElement(By.id("email_address")).sendKeys("voikinatatyana@gmail.com");
        System.out.println("--->поле заполнено<---");
        driver.findElement(By.id("password")).sendKeys("28111986");
        System.out.println("--->поле заполнено<---");
        driver.findElement(By.id("confirmation")).sendKeys("28111986");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[3]/button/span/span")).click();
        Assert.assertNotNull(driver.findElement(By.className("error-msg")));
        Thread.sleep(3000);
    }

    @After
    public void quit () {
        driver.quit();
    }
}

