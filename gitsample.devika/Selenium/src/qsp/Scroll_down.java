package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_down
{
    public static void main(String[] args) throws InterruptedException
    {
    	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.amazon.in/");
		   Thread.sleep(2000);
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   WebElement ele = driver.findElement(By.xpath("//img[@alt='YELONA Multipurpose Kitchen Gadgets Set 6 Pieces, Space Saving Cooking Tools- Grater, Peeler, Garlic/Ginger Grinder,...']"));
		   int x=ele.getLocation().getX();
		   int y=ele.getLocation().getY();
		   System.out.println(x+" "+y);
		   
		   js.executeScript("window.scrollBy("+x+","+y+")");
		   Thread.sleep(2000);
		   for(int i=0;i<3;i++)
		   {
			   js.executeScript("window.scrollBy(0,300)");
			   Thread.sleep(2000);
		   }
		   for(int i=0;i<3;i++)
		   {
			   js.executeScript("window.scrollBy(0,-300)");
			   Thread.sleep(2000);
			   
		   }
		   
	}
}
