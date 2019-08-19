package com.example.reportng;

import org.testng.annotations.Test;

public class WebTest {
    private int m_numberOfTimes;
    WebTest(int numberOfTimes) {
        m_numberOfTimes = numberOfTimes;
    }

    @Test
    public void testServer() {
        // access the web page
        System.out.println(m_numberOfTimes);
    }

}
