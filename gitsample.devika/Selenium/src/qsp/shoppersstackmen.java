package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class shoppersstackmen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(7000);
		driver.findElement(By.id("men")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		

	}

}
