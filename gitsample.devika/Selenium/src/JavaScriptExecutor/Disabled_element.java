package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.apache.poi.hslf.record.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_element {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("file:///C:/Users/DELL/OneDrive/Desktop/Disabled%20element.html");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("document.getElementById('d1').value='Admin'");
       Thread.sleep(2000);
       js.executeScript("document.getElementById('d1').value=''");

	}

}
