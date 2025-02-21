package qsp;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newInfinite?scenario=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
	    Set<String> allwh = driver.getWindowHandles();
	    ArrayList<String> ls=new ArrayList<String>(allwh);
	    driver.switchTo().window(ls.get(1));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    for(;;)
	    {
			js.executeScript("window.scrollBy(0,300)");	
	    }

	}

}
