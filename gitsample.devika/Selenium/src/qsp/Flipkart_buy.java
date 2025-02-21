package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart_buy {

	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	   WebDriver driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("samsung mobile");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[@target='_blank']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']")).click();
	   

	}

}
