package Auto_Suggestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_if_suggestion_disappear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("mobiles");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//div[text()='oppo mobile 5g'])")).click();
	}

}
