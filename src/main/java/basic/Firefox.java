package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Firefox implements driver {
    private WebDriver driver;
    private static Firefox f= new Firefox();
    private Firefox (){
        System.setProperty("webdriver.gecko.driver","c:\\driver\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    static Firefox getInstance(){
        return f;
    }
   @Override
    public WebDriver getDriver() {
        return f.driver;
    }
}
