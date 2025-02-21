package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover_Demo {
	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		   Thread.sleep(2000);
		   WebElement ele1 = driver.findElement(By.xpath("//img[@src='/assets/message-hint-J20Zlhln.png']"));
		   Actions act=new Actions(driver);
		   act.moveToElement(ele1).perform();
		   
		   Thread.sleep(2000);
		   //driver.findElement(By.xpath("//a[text()='Ratings']"));
		   //WebElement ele2 = driver.findElement(By.xpath("//div[@class='flex justify-center pt-2']"));
		   //Actions act1=new Actions(driver);
		   //act1.moveToElement(ele1).perform();
	}
		  

}
