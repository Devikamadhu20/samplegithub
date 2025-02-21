package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_Demo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		   Thread.sleep(2000);
		   
		   /*WebElement drag = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		    Actions act=new Actions(driver);
		    act.dragAndDropBy(drag, 20, 30).perform();
		    */
		   /*driver.get("https://demoapps.qspiders.com/ui/dragDrop/axisRestricted?sublist=1");
		    Thread.sleep(1000);
		    WebElement drag = driver.findElement(By.xpath("//div[text()='Only X']"));
		    WebElement drag1 = driver.findElement(By.xpath("//div[text()='Only Y']"));		
		    Actions act=new Actions(driver);
		    act.dragAndDropBy(drag, -30, 0).perform();
		    Thread.sleep(2000);
		    act.dragAndDropBy(drag1, 0,70).perform();
		    */
		    driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		    Thread.sleep(1000);
		    WebElement src = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		    WebElement src1 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		    WebElement src2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		    WebElement src3 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		    WebElement dst = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		    WebElement dst1 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		    Actions act=new Actions(driver);
		    act.dragAndDrop(src, dst).perform();	
		    act.dragAndDrop(src2, dst).perform();
		    act.dragAndDrop(src1, dst1).perform();	
		    act.dragAndDrop(src3, dst1).perform();
	   
	   
	}
	   
	}


