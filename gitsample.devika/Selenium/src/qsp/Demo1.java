package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		ChromeDriver driver1=new ChromeDriver();
         Thread.sleep(2000);
         
         //driver1.close();
         //driver.quit();
	}

}
