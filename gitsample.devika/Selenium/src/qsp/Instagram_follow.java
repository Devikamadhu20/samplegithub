package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram_follow {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("devika_madhu209");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Devika@1996");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	

	}

}
