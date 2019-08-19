package com.example.reportng;

import basic.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

class Screenshot {
    void saveScreenshot(ITestResult tr){//入参为正在执行的用例
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyyMMdd HHmmss");//定义一个日期格式,时间不能有：文件命名会出错
        String mDateTime=dateFormat.format(new Date()); //new Date(),获取当前日期；并把该日期格式化
        String fileName = mDateTime + "_" + tr.getName()+".png";//图片名:格式化后的时间_用例名
        String filePath;//保存位置

        WebDriver driver=new DriverFactory().initialdriver("Firefox");
        File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//截图
        filePath="C:\\codebase\\reportng\\test-output\\screenshot\\"+fileName;//定义存放路径
        System.out.println("文件路径："+filePath);
        try{
            FileUtils.copyFile(screenshot,new File(filePath));//在这个路径下新建一个文件，并将截图copy到目标文件
        }catch(Exception e){
            System.out.println("截图失败" + e.getMessage());
//            filePath = "截图失败" + e.getMessage();
//            logger.error(filePath);//输出log信息到控制台
        }
        if (!"".equals(filePath)) {
            Reporter.setCurrentTestResult(tr);
            Reporter.log(filePath);
            // 把截图写入到Html报告中方便查看
            Reporter.log("<img src=\"../../" + filePath + "\"/>");

        }
    }
}
