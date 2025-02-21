package qsp;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swap {
	

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("file:///C:/Users/DELL/Desktop/Swap.html");
		   Thread.sleep(2000);
		   WebElement ele1 = driver.findElement(By.id("a1"));
		   WebElement ele2 = driver.findElement(By.id("a2"));
		   WebElement ele3 = driver.findElement(By.id("a3"));
		   Thread.sleep(2000);
		   ele1.sendKeys(Keys.CONTROL+"ax");
           ele3.sendKeys(Keys.CONTROL+"v");
		   ele2.sendKeys(Keys.CONTROL+"ax");
		   ele1.sendKeys(Keys.CONTROL+"v");
		   ele3.sendKeys(Keys.CONTROL+"ax");
		   ele2.sendKeys(Keys.CONTROL+"v");

}
}
