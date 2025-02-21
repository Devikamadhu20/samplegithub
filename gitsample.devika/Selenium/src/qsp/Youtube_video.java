package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube_video {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kantaara song");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Kantara - Varaha Roopam Video Song| Rishab Shetty| Ajaneesh Loknath| Vijay Kiragandur| Hombale Films']")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//button[@title='I like this'][1]")).click();
	}

}
