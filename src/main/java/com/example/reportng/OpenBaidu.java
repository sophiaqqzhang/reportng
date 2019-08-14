package com.example.reportng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


class OpenBaidu {
  private WebDriver driver;
    void setDriver() {
      System.setProperty("webdriver.gecko.driver","c:\\driver\\geckodriver.exe");
      driver=new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.manage().window().maximize();
    }
    String openBaidu(){
        driver.get("https://www.baidu.com/");
        return driver.getTitle();
    }
    void quit(){
        driver.close();
    }

}
