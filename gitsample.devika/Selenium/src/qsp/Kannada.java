package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kannada {
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		   Thread.sleep(2000);
		   WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		   Actions act=new Actions(driver);
		   act.contextClick(ele).perform();
		   Robot r=new Robot();
		   r.keyPress(KeyEvent.VK_T);
		   r.keyRelease(KeyEvent.VK_T);
		   Thread.sleep(2000);
		   r.keyPress(KeyEvent.VK_CONTROL);
		   r.keyPress(KeyEvent.VK_TAB);
		   r.keyRelease(KeyEvent.VK_CONTROL);
		   r.keyRelease(KeyEvent.VK_TAB);
		   
		   
		   

}
}
