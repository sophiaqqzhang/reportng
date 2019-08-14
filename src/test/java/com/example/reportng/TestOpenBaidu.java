package com.example.reportng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOpenBaidu {
    private OpenBaidu baidu=new OpenBaidu();
    @BeforeTest
    public void initializeBrowser(){
        baidu.setDriver();
    }
    @Test
    public void testOpenBaidu(){
        Assert.assertEquals("百度一下，你就知道",baidu.openBaidu());
    }
    @AfterTest
    public void teardown(){
        baidu.quit();
    }
}
