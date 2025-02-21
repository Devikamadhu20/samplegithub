package Qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Multiple_Times 
{
    @Test(invocationCount=3, priority = 1)
    public void test1()
    {
    	Reporter.log("Selenium",true);
    }
    @Test
    public void test2()
    {
    	Reporter.log("Grid",true);
    }

}
