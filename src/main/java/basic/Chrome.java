package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Chrome implements driver {
    private WebDriver driver;
    private static Chrome c= new Chrome();
    private Chrome(){
        System.setProperty("webdriver.chrome.driver","c:\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    static Chrome getInstance(){
        return c;
    }
    @Override
    public WebDriver getDriver() {
        return c.driver;
    }
}
