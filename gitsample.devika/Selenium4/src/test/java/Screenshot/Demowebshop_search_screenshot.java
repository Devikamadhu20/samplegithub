package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demowebshop_search_screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		driver.findElement(By.xpath("(//input[@value='Search'])[1]")).click();
		//typecast
		TakesScreenshot ts=(TakesScreenshot)driver;
		//temporary location
		File src = ts.getScreenshotAs(OutputType.FILE);
		//destination file
		File dst=new File("./ScreenShots/search.png");
		FileHandler.copy(src, dst);
		driver.close();
		
		
	}

}
