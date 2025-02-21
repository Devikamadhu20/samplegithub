package Window_handles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_multiple_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String p_id = driver.getWindowHandle();
		System.out.println(p_id);
		driver.findElement(By.linkText("Facebook")).click();
		
		Set<String> c_id = driver.getWindowHandles();
		
			for(String win:c_id)
			{
	               driver.switchTo().window(win);
	               if(driver.getTitle().contains("Facebook"))
	               {
	            	   driver.findElement(By.xpath("//input[@name='email']"));
	            	   driver.close();
	               }
			}
		driver.switchTo().window(p_id);
		driver.findElement(By.id("small-searchitems")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input(@type='submit')")).click();
		driver.close();
		
		
		
		
	}

}
