package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouehover_selectthesuggestion_directly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
		driver.findElement(By.xpath("//a[text()='Tab']")).click();
		WebElement men = driver.findElement(By.xpath("//li[text()='Men ']"));
		Actions act=new Actions(driver);
		act.moveToElement(men).build().perform();
		driver.findElement(By.xpath("//li[text()=' Men Ethnic']")).click();
		
		
	}

}
