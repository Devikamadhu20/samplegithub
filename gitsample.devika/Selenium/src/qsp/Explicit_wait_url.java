package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_url {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		//System.out.println(title);
		//wait.until(ExpectedConditions.urlContains("com"));
		wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
		driver.findElement(By.id("email")).sendKeys("admin");

	}

}
