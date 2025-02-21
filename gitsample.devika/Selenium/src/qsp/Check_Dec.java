package qsp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Check_Dec {
	public static void main(String[] args) throws InterruptedException 
	{
		   System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/r.php");
		   Thread.sleep(10000);
		   WebElement ele = driver.findElement(By.id("month"));
		   Select s=new Select(ele);
		   List<WebElement> opt = s.getOptions();
		   ArrayList<String> l=new ArrayList<String>();
		   for(WebElement we:opt)
		   {
			   String l1 = we.getText();
			   l.add(l1);
		   }
		   
		   
		if(l.contains("Dec"))
		   {
			 System.out.println("is present");  
		   }
		else
		{
			System.out.println("is not present");
		}
		   l.remove("Dec");
		   for(String str:l)
		   {
			   System.out.println(str);
		   }
		   
		   
	}
}
