package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class currenturl {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com");
	Thread.sleep(1000);
	String url = driver.getCurrentUrl();
	System.out.println(url);

	}

}
