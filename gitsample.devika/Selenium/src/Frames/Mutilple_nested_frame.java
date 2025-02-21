package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mutilple_nested_frame {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/MainFramee.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin@123");
		WebElement f1 = driver.findElement(By.xpath("//iframe[@id='f4']"));
		driver.switchTo().frame(f1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9876564576");
		//driver.switchTo().frame(2);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin234@gmail.com");

	}

}
