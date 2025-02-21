package practice.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.annotations.Test;

public class SampleTestForScreenShot {
	@Test
	public void amazonTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
		
		//step-1: create an object to EventFiring Webdriver
		
	}

}
