package basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.concurrent.TimeUnit;

public class IE implements driver{
    private  WebDriver driver;
    private static IE i=new IE();
    private IE(){
        System.setProperty("webdriver.ie.driver", "c:\\driver\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    static IE getInstance(){
        return i;
    }
    @Override
    public WebDriver getDriver() {
        return i.driver;
    }
}
