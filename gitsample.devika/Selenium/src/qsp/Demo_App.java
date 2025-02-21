package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo_App {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(1000);
		driver.findElement(By.name("name")).sendKeys("Devika");
		
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(1000);
		driver.findElement(By.id("btn")).click();
		
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		Thread.sleep(1000);
		driver.findElement(By.id("attended")).click();
		
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(1000);
		driver.findElement(By.id("domain2")).click();

	}

}
