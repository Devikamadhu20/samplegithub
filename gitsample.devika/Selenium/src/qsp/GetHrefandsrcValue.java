package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetHrefandsrcValue {
	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.flipkart.com/");
		   Thread.sleep(2000);
		   List<WebElement> links = driver.findElements(By.xpath("//a"));
		   int count = links.size();
		   for(int i=0;i<count;i++)
		   {
			   WebElement ele = links.get(i);
			   System.out.println("href");
			   System.out.println(ele.getAttribute("href"));
			   
		   }

}
}
