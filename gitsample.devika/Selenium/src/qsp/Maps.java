package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='hArJGc vF7Cdb']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("Bangalore");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Mysore");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[@aria-label='Search'])[3]")).click();
	}

}
