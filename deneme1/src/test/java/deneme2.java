import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class deneme2 {
    public static void main(String[] args) throws InterruptedException {


        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\IdeaProjects\\SeleniumProject\\Driver\\geckodriver");
        System.setProperty("webdriver.chrome.driver", "drivers/yenichrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions action =   new Actions(driver);
        WebDriverWait wait;
        wait = new WebDriverWait(driver, 15);

        //WebDriver driver = new FirefoxDriver();
        //go to gittigidiyor.com
        driver.get("https://www.gittigidiyor.com/");
        //driver.close();
        Thread.sleep(3);
        //driver.quit();
        action.moveToElement(driver.findElement(By.xpath("//*[@id='main-header']/div[3]/div/div/div/div[3]/div/div[1]/div"))).perform();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-header']/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/div/a")));
        driver.findElement(By.xpath("//*[@id='main-header']/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/div/a")).click();
        //enter email address
        driver.findElement(By.id("L-UserNameField")).sendKeys("email");
        //enter pwd
        driver.findElement(By.id("L-PasswordField")).sendKeys("password");
        Thread.sleep(2);
        //click on giriş yap
        driver.findElement(By.cssSelector("#gg-login-enter")).click();
        Thread.sleep(1);
        //enter text(bilgisayar) in search textbox
        driver.findElement(By.name("k")).sendKeys("bilgisayar");
        //click on search button
        driver.findElement(By.xpath("//*[@id='main-header']/div[3]/div/div/div/div[2]/form/div/div[2]")).click();
        Thread.sleep(1);
        // click on the 2nd page
        js.executeScript("window.scrollBy(0,30000)");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a"))).click();
        Thread.sleep(2);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"best-match-right\"]/div[3]/div[2]/ul"))).click();
        Thread.sleep(2);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"item-info-block-678402322\"]/div/div[1]/div[1]/h3/span"))).click();
        Thread.sleep(2);

        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("//*[@id=\"add-to-basket\"]")).click();
        Thread.sleep(2);

        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/a/div[1]/div"))).perform();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/div/div/div/div[2]/div[4]/div[1]/a")));
        driver.findElement(By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/div/div/div/div[2]/div[4]/div[1]/a")).click();

        //delete item
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"cart-item-470756402\"]/div[1]/div[3]/div/div[2]/div/a[1]")));
        driver.findElement(By.xpath("//*[@id=\"cart-item-470756402\"]/div[1]/div[3]/div/div[2]/div/a[1]")).click();




    }
}