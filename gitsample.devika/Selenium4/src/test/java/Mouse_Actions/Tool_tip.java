package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_tip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
		driver.findElement(By.xpath("//a[text()='Image']")).click();
		
		WebElement tool_tip = driver.findElement(By.xpath("//img[@title='Order Placed Image']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(tool_tip).build().perform();
		System.out.println("order placed successfully");
	}

}
