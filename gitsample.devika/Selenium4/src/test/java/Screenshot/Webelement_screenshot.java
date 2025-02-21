package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Webelement_screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		WebElement search_icon = driver.findElement(By.xpath("//input[@type='submit']"));
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = search_icon.getScreenshotAs(OutputType.FILE);
		File dst=new File("./ScreenShots/Searchicon.png");
		FileHandler.copy(src, dst);
		
		
	}

}
