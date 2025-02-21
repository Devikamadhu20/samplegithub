package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookcsslocateor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("devika@gmail.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Dev@879");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		

	}

}
