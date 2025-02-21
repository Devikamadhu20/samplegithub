package qsp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Address_parentbrowser {

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.flipkart.com/");
      driver.manage().window().maximize();
      Thread.sleep(2000);
      driver.findElement(By.className("Pke_EE")).sendKeys("iphone pro 13 max");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      Thread.sleep(2000);
       Set<String> allwh = driver.getWindowHandles();
      
      System.out.println(allwh.size());
      for(String wh:allwh)
      {
    	  driver.switchTo().window(wh);
    	  System.out.println(driver.getTitle());
    	  driver.close();
      }


	}

}
