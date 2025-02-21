package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_frames {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/u.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement un = driver.findElement(By.id("f3"));
		 un.sendKeys("admin");
		WebElement f1 = driver.findElement(By.xpath("//iframe[@src='M.html']"));
		driver.switchTo().frame(f1);
		WebElement mob = driver.findElement(By.id("f1"));
		mob.sendKeys("9876789956");
		//driver.switchTo().defaultContent();
		WebElement f2 = driver.findElement(By.xpath("//iframe[@src='e.html']"));
		driver.switchTo().frame(f2);
		WebElement email = driver.findElement(By.id("f2"));
		email.sendKeys("admin@gmail.com");
		email.clear();
		driver.switchTo().parentFrame();
		un.clear();
		
		
		
	}

}
