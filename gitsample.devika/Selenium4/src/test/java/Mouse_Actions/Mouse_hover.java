package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Dev");
		Actions act=new Actions(driver);
		WebElement eye_icon = driver.findElement(By.xpath("//img[@class='w-6 h-6 mt-4 absolute ml-72 cursor-pointer']"));
		act.moveToElement(eye_icon).click().build().perform();
	}

}
