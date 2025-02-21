package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Max_min_Robot {
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		   Thread.sleep(2000);
		   Robot r=new Robot();
		   r.keyPress(KeyEvent.VK_WINDOWS);
		   r.keyPress(KeyEvent.VK_D);//to minimize
		   r.keyRelease(KeyEvent.VK_WINDOWS);
		   r.keyRelease(KeyEvent.VK_D);
		   
		   Thread.sleep(2000);
		   driver.manage().window().maximize();
		   
		   /*Thread.sleep(5000);
		   r.keyPress(KeyEvent.VK_CONTROL);
		   r.keyPress(KeyEvent.VK_W);//to close
		   r.keyRelease(KeyEvent.VK_CONTROL);
		   r.keyRelease(KeyEvent.VK_W);*/
		   driver.close();
		   
}
}
