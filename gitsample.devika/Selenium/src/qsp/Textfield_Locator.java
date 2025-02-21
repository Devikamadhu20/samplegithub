package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfield_Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/Sample.html");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("input")).sendKeys("admin");
		//driver.findElement(By.id("a1")).sendKeys("Devika");
		//driver.findElement(By.name("a2")).sendKeys("Kush");
		//driver.findElement(By.className("a3")).sendKeys("Dev");

	}

}
