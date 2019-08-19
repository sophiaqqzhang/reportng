package com.example.reportng;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class ScreenshotListener extends TestListenerAdapter {//新建一个截图监听器，此监听器继承TestListenerAdapter
    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        new Screenshot().saveScreenshot(tr);//new 一个截图实例，并调用截图功能
        //可以只重写一个方法吗？不是有3个方法吗
    }
    @Override
    public void onTestSuccess(ITestResult tr){
        super.onTestSuccess(tr);
//        log.info(tr.getName() + " 测试用例执行成功！");
    }

    @Override
    public void onTestSkipped(ITestResult tr){
        super.onTestSkipped(tr);
//        log.warn(tr.getName() + " 测试用例跳过！");
    }
}
