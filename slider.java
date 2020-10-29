import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.findElement;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public  class Slider{
    WebDriver driver;
    private Object sliderValue;

    @Test
    public void slider() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        driver.navigate().to("https://brw-konfigurator-szaf-website.bk.netizens.pl/konfigurator-flex/height-settings");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[6]/a")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/img")).click();

            WebElement slider =driver.findElement(By.xpath("//*[@id=\"brw-configurator\"]/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/div"));

            Dimension size = slider.getSize();
        int width = size.getWidth();
        int location = slider.getLocation().getX();

            Actions a = new Actions(driver);
            a.moveToElement(slider).click();

        a.moveToElement(slider).click().dragAndDropBy(slider,location + width);//??
        a.moveToElement(slider).build().perform();


        //?????????


        }
    }


