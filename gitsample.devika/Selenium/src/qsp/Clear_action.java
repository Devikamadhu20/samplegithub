package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clear_action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/Demo.html");
		Thread.sleep(1000);
		//driver.findElement(By.tagName("input")).clear();
		//driver.findElement(By.id("a1")).clear();
		driver.findElement(By.name("n1")).clear();
		driver.findElement(By.className("c1")).clear();

	}

}
