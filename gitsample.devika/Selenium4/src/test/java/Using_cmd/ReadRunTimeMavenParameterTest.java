package Using_cmd;

import org.testng.annotations.Test;

public class ReadRunTimeMavenParameterTest
{
  @Test
  public void runtimeparametertest()
  {
	  String URL=System.getProperty("url");
	  String BROWSER=System.getProperty("browser");
	  String USERNAME=System.getProperty("username");
	  String PASSWORD=System.getProperty("password");
	  
	System.out.println("Env Data=====>"+URL);
	System.out.println("Browser Data=====>"+BROWSER);
	System.out.println("Username Data======>"+USERNAME);
	System.out.println("Password Data======>"+PASSWORD);
  }
}
