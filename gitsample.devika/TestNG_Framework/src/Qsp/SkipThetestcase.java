package Qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipThetestcase 
{
  @Test(enabled = false)
	  public void Demo1()
	  {
	      Reporter.log("Selenium",true);
	  }
  @Test
  public void Demo2()
  {
	Reporter.log("Grid",true);  
  }
  }

