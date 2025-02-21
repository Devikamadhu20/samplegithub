package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Double_right_hold {
	public static void main(String[] args) throws InterruptedException 
	{
		   System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   /*driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		   Thread.sleep(5000);
		   WebElement src = driver.findElement(By.id("box7"));
		   WebElement dst = driver.findElement(By.id("box106"));
		   Actions act=new Actions(driver);
		   act.dragAndDrop(src, dst).perform();
		   */
		   /*driver.get("http://www.demo.guru99.com/test/simple_context_menu.html");
		   Thread.sleep(5000);
		   WebElement dclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		    Actions act=new Actions(driver);
		    act.doubleClick(dclick).perform();
		   */
		    
		        /*driver.get("http://www.demo.guru99.com/test/simple_context_menu.html");
			   Thread.sleep(5000);
			   WebElement rclick = driver.findElement(By.xpath("//span[text()='right click me']"));
			    Actions act=new Actions(driver);
			    act.contextClick(rclick).perform();
			    */
			    
			    driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
				   Thread.sleep(2000);
				   WebElement chold = driver.findElement(By.id("circle"));
				    Actions act=new Actions(driver);
				    act.clickAndHold(chold).perform();
			   
		   


}
}
