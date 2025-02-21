package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_box
{
       public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	   WebDriver driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("file:///C:/Users/DELL/Desktop/checkbox.html");
	   Thread.sleep(2000);
	   List<WebElement> check=driver.findElements(By.xpath("//input"));
	   int count=check.size();
	   for(int i=0;i<count;i++)//click checkbox
	   {
		WebElement we = check.get(i);
	    we.click();
	   }
		for(int i=count-1;i>=0;i--)//uncheck the box
		{
		   WebElement we = check.get(i);
		   we.click(); 
		}
    }
 }
