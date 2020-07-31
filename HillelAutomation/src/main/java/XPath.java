import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
            WebDriver driver;

        @Before
        public void beforeTest() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://kasta.ua/");
            Thread.sleep(3000);
        }

        @Test
        public void testButtonBlack () throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"up\"]/div[2]/div/div[1]/div[2]/a[1]/img")).click();
            Thread.sleep(3000);
            Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[1]/form/button")));
            System.out.println("Test finished &#128522");
            Thread.sleep(3000);
        }

        @Test
        public void testButtonFavorites () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"up\"]/div[2]/div/div[1]/div[2]/div[4]/a")).click();
        Thread.sleep(3000);
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"popup-container\"]/div/div/div[2]/div/div/div/div[1]/div[1]")));
        System.out.println("Test finished &#128522");
        Thread.sleep(3000);
        }

        @Test
        public void testButtonBusket () throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"up\"]/div[2]/div/div[1]/div[2]/a[2]/span[1]/img")).click();
            Thread.sleep(3000);
            Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div[2]/div[3]/div/div/div[1]/h2")));
            System.out.println("Test finished &#128522");
            Thread.sleep(3000);
        }

        @Test
        public void testButtonClothes () throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"up\"]/div[2]/div/div[2]/div[1]/div[2]/div/ul/li[2]/a")).click();
            Thread.sleep(3000);
            Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"catalogue\"]/div[2]/div[1]/div[1]/span/span[1]/a/span")));
            System.out.println("Test finished &#128522");
            Thread.sleep(3000);
        }

    @Test
    public void testButtonCall () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div[1]/div/div[2]")).click();
        Thread.sleep(3000);
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"support-widget\"]/div/div[2]/div")));
        System.out.println("Test finished &#128522");
        Thread.sleep(3000);
    }

        @After
    public void quit() {
            driver.quit();
        }



}
