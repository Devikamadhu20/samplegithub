package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Foreach_loop {
		public static void main(String[] args) throws InterruptedException 
		{
			   System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			   WebDriver driver=new FirefoxDriver();
			   driver.manage().window().maximize();
			   driver.get("https://www.amazon.in/");
			   Thread.sleep(2000);
			   List<WebElement> links = driver.findElements(By.xpath("//a"));
			   for(WebElement we:links)
			   {
				   System.out.println("Text: "+we.getText());
				   System.out.println("href: "+we.getAttribute("href"));
			   }
			   
			   List<WebElement> images = driver.findElements(By.xpath("//img"));
			   for(WebElement wel:images)
			   {
				   System.out.println("src: "+wel.getAttribute("src"));
			   }
			   driver.get("file:///C:/Users/DELL/Desktop/checkbox.html");
			  List<WebElement> link1 = driver.findElements(By.xpath("//input"));
			   
			   

	}

}
