package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flip_Amazon {
	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   /*driver.get("https://www.flipkart.com/");
		   Thread.sleep(2000);
		   List<WebElement> images = driver.findElements(By.xpath("//img"));
		   System.out.println(images.size());
		   //driver.close();*/
		   
		   //to get in reverse order all the links
		 driver.get("https://www.amazon.in/");
		   Thread.sleep(2000);
		   List<WebElement> links = driver.findElements(By.xpath("//a"));
		   int count=links.size();
		   System.out.println(count);
		   for(int i=count-1;i>=0;i--)
		   {
			   WebElement we = links.get(i);//points to index
			   System.out.println(we.getText()); 
		   }
		   
			   
			   
		   
		   
		   
	}
}
