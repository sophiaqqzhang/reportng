package com.example.reportng;

import basic.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class OpenBaiDu {
    private WebDriver driver;
    public void setUp(){
        driver=new DriverFactory().initialdriver("Firefox");
    }
    String openBaidu(){
        driver.get("https://www.baidu.com/");
        return driver.getTitle();
    }
    String house(){
        driver.findElement(By.linkText("新闻")).click();
        driver.findElement(By.linkText("房产")).click();
        return driver.getTitle();
    }
    void quit(){
        driver.close();
    }

}
