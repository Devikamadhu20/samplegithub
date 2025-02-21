package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://bannerughattabiopark.org/");
		driver.navigate().to("https://bannerughattabiopark.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//String src = driver.getPageSource();
		//System.out.println(src);
		//driver.close();
		//driver.quit();
		driver.findElement(By.id("popupBoxClose")).click();
		driver.findElement(By.xpath("//a[text()= 'About park']")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='right_header']/span/a"));
		for(WebElement awh:ele)
		{
			System.out.println(awh.getText());
		}
		     List<WebElement> count = driver.findElements(By.xpath("//a"));
		     System.out.println(count.size()+"links");
		     List<WebElement> imgs = driver.findElements(By.xpath("//img"));
		     System.out.println(count.size() +"images");
		     
		 
		     
		driver.findElement(By.xpath("(//i[@class='fa fa-ticket'])[2]")).click();
		Set<String> allwh = driver.getWindowHandles();
		int c = allwh.size();
		System.out.println(c);
		//ArrayList<String> ls=new ArrayList<String>(allwh);
		//driver.switchTo().window(ls.get(1));
		Iterator<String> it = allwh.iterator();//to fetch one by one instead of arraylist
		String pid = it.next();
		String cid = it.next();
		driver.switchTo().window(cid);
		driver.findElement(By.xpath("//a[text()='Animal Adoption ']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement sch = driver.findElement(By.xpath("(//img[@class='img-responsive'])[2]"));
		Point loc = sch.getLocation();
		//int x = loc.getX();
		int y=loc.getY();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		WebElement ele1 = driver.findElement(By.xpath("//a[@data-toggle='collapse']"));
		Point loc1 = ele1.getLocation();
		int y1 = loc1.getY();
		
		js.executeScript("window.scrollBy(0,"+y1+")");
		ele1.click();
		WebElement add = driver.findElement(By.xpath("//select[@id='donate']"));
		Select s=new Select(add);
		s.selectByValue("Donation for Animal Adoption");
		driver.close();
		driver.switchTo().window(pid);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		 WebElement ele2 = driver.findElement(By.xpath("//span[text()='Social']"));
	        Point loc2 = ele2.getLocation();
	        int y2 = loc2.getY();
	      
	        js.executeScript("window.scrollBy(0,"+y2+")");
	        driver.findElement(By.id("popupBoxClose")).click();
	        
	        WebElement f = driver.findElement(By.xpath("(//iframe)[2]"));
	        driver.switchTo().frame(f);
	        driver.findElement(By.xpath("//span[text()='View on X']")).click();
	        driver.switchTo().defaultContent();
	        WebElement f1 = driver.findElement(By.xpath("(//iframe)[1]"));
	        driver.switchTo().frame(f1);
	         Set<String> win = driver.getWindowHandles();
			Iterator<String> itt = win.iterator();//to fetch one by one instead of arraylist
			String pidd = itt.next();
			String cidd = itt.next();
			driver.switchTo().window(cidd);
			 driver.findElement(By.xpath("//label[@class='css-175oi2r r-1roi411 r-z2wwpe r-rs99b7 r-18u37iz']")).sendKeys("9087654345");
	        driver.close();
	        driver.switchTo().window(pidd);
	        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	       
	}

}
