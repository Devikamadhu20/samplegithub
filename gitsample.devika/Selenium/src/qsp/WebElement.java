package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/ui/checkbox/selected?sublist=1");
	Thread.sleep(2000);
	//System.out.println(driver.findElement(By.id("domain1")).isDisplayed());
	System.out.println(driver.findElement(By.id("domain1")).isSelected());
	
	
}
}