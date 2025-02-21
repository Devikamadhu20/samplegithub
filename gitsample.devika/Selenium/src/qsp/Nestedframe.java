package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nestedframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Documents/mainframe/username.html");
		Thread.sleep(2000);
        driver.findElement(By.name("t1")).sendKeys("Devika");
        driver.switchTo().frame(0);
        //driver.switchTo().frame("f1");
        //driver.switchTo().frame("frame1");
        //WebElement f1=driver.findElement(By.xpath("//iframe[@src='frame1.html']"));
        //driver.switchTo().frame(f1);
        Thread.sleep(2000);
        driver.findElement(By.name("t2")).sendKeys("admin@123");
        
	}

}

