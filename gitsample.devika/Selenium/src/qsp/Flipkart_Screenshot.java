package qsp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone 15 pro");
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Apple iPhone 15 Pro (White Titanium, 1 TB)']")).click();
		Thread.sleep(2000);
		
		
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String> ls =new ArrayList<String>(allwh);
		driver.switchTo().window(ls.get(1));
		Thread.sleep(2000);
		Generic_Screenshot.getPhoto(driver);
		driver.close();
		driver.switchTo().window(ls.get(0));
		Thread.sleep(2000);
		Generic_Screenshot.getPhoto(driver);
		driver.close();

	}

}
