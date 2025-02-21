package qsp;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/r.php");
		   Thread.sleep(2000);
		   WebElement ele = driver.findElement(By.id("month"));
		   Select s=new Select(ele);
		   TreeSet<String> ts=new TreeSet<String>();
		   List<WebElement> options = s.getOptions();
		   System.out.println(options.size());
		    for(WebElement we:options)
		   {
			 String text = we.getText();
			ts.add(text);
		   }
		   
		   for(String l1:ts) {
			   System.out.println(l1);
		   }
		   
		   

	}

}
