package basic;

import org.openqa.selenium.WebDriver;

public  class DriverFactory {
    private WebDriver driver;//switch 语句需要一个初始值，负责当输入不符合时会发生空指针
    public WebDriver initialdriver(String driverName){
        if(driver==null) {
            switch (driverName) {
                case "Firefox":
                    driver=Firefox.getInstance().getDriver();
                    break;
                case "IE":
                    driver =IE.getInstance().getDriver();
                    break;
                case "Chrome":
                    driver = Chrome.getInstance().getDriver();
                    break;
                default:
                    System.out.println("please input the correct driver name!");
            }
        }
        return driver;
    }
}
