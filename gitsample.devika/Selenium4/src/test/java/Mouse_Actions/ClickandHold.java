package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/clickHold");
		//driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		Thread.sleep(2000);
		WebElement cir = driver.findElement(By.id("circle"));
		
		Actions act=new Actions(driver);
		
		act.clickAndHold(cir).build().perform();
			
	}

}
