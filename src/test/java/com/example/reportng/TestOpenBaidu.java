package com.example.reportng;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestOpenBaidu {
    private OpenBaiDu baidu=new OpenBaiDu();
    @BeforeClass
    public void st(){
      baidu.setUp();
    }
    @Test
    public void testOpenBaidu(){
        Assert.assertEquals(baidu.openBaidu(),"百度一下，你就知道");
    }
    @Test
    public void testOpenHouse(){
         Assert.assertEquals(baidu.house(),"百度新闻——房产资讯");
    }
    @AfterClass
    public void tearDown(){
        baidu.quit();
    }
}
