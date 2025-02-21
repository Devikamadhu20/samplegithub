package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class select_multipleoptions {
	public static void main(String[] args) throws InterruptedException 
	{
		   System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("file:///C:/Users/DELL/Desktop/Multiselect%20dropdown.html");
		   Thread.sleep(2000);
		   WebElement ele=driver.findElement(By.id("nandanas"));
		   Select s=new Select(ele);
		   s.selectByIndex(2);
		   Thread.sleep(1000);
		   s.selectByValue("i");
		   Thread.sleep(1000);
		   s.selectByVisibleText("crispy corn");
		   Thread.sleep(1000);
		   s.deselectAll();
		   
		   
		   boolean b = s.isMultiple();
		   if(b)
		   {
			   System.out.println("is multi select drop down");
		   }
		   else
		   {
			   System.out.println("is not multiselect dropdown");
		   }
	}
}
