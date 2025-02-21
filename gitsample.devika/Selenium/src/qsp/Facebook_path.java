package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_path {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Kushvik@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Dev@7786");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
