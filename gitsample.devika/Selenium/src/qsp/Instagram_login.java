package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagram_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	 Thread.sleep(1000);
	 driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Devika");
	 Thread.sleep(1000);
	 driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Devika");
	 Thread.sleep(1000);
	 driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
