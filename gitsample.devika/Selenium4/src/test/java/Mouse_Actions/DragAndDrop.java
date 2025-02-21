package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		  driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		  driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		  driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		  WebElement src = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		  
		  Actions act=new Actions(driver);
		  act.dragAndDropBy(src, 50, 100).build().perform();
		  
	}

}
