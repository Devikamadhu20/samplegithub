package qsp;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ArrayListTreesettypecasting {

	public static void main(String[] args) throws InterruptedException 
	{
		   System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/r.php");
		   Thread.sleep(5000);
		   WebElement ele = driver.findElement(By.id("month"));
		   Select s=new Select(ele);
		   List<WebElement> opt = s.getOptions();
		   ArrayList<String> l=new ArrayList<String>();
		   for(WebElement we:opt)
		   {
			   String l1 = we.getText();
			   l.add(l1);
		   }
		   for(String str:l)
		   {
			   System.out.println(str);
		   }
		   
		   
		   System.out.println("Treeset");
		   TreeSet<String> t=new TreeSet<String>(l);
		   for(String we:t)
		   {
			  System.out.println(we); 
		   }
		   System.out.println("order of insertion");
		   ArrayList<String> l1=new ArrayList<String>(t);
		   for(String str:l1)
		   {
			   System.out.println(str);
		   }	 
		   
	}

}
