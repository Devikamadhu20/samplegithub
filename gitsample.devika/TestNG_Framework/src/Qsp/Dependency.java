package Qsp;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency
{
   @Test
   public void compose()
   {
	   Reporter.log("message composed",true);
   }
   @Test
   public void sentitems()
   {
	   Reporter.log("message sent",true);
	   fail();
   }
   @Test(dependsOnMethods = "sentitems")
   public void trash()
   {
	   Reporter.log("message deleted",true);
   }
}
