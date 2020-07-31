import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitAnnotations {
    WebDriver driver;

    @Before
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://loveandcook.net.ua/login/");
        Thread.sleep(3000);
        driver.findElement(By.id("user_login")).sendKeys("voikina");
        }
        @Test
        public void testSuccessfulLoginTest () throws InterruptedException {
            driver.findElement(By.id("user_pass")).sendKeys("28111986");
            Thread.sleep(3000);
            driver.findElement(By.id("user_pass")).sendKeys(Keys.ENTER);
            Assert.assertNotNull(driver.findElement(By.className("ilovewp-page-intro")));
            Thread.sleep(3000);
        }

        @Test
        public void testErrorLoginTest () throws InterruptedException {
            driver.findElement(By.id("user_pass")).sendKeys("2811198");
            Thread.sleep(3000);
            driver.findElement(By.id("user_pass")).sendKeys(Keys.ENTER);
            Assert.assertNotNull(driver.findElement(By.className("tml-alerts")));
            Thread.sleep(3000);
        }

        @Test
        public void testSuccsessfulSearchTest () throws InterruptedException {
            driver.findElement(By.className("search-field")).sendKeys("Шоколадный торт");
            Thread.sleep(3000);
            driver.findElement(By.className("search-field")).sendKeys(Keys.ENTER);
            Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/h1")));
            System.out.println("--->подтверждение<---");
            Thread.sleep(3000);
        }

        @Test
        public void testErrorSearchTest () throws InterruptedException {
            driver.findElement(By.className("search-field")).sendKeys("ydgfuywf");
            Thread.sleep(3000);
            driver.findElement(By.className("search-field")).sendKeys(Keys.ENTER);
            Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/section/div")));
            Thread.sleep(3000);
            System.out.println("--->подтверждение<---");
        }

       @Test
       public void testClickTest () throws InterruptedException {
           driver.findElement(By.className("menu-item-926")).click();
           Thread.sleep(3000);
           Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"site-content\"]/div")));
           Thread.sleep(3000);
           System.out.println("--->подтверждение<---");
       }


        @After
        public void quit () {
            driver.quit();
        }

    }
