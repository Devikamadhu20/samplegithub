package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoVirtualKeyboard {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/virtual?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='bg-blue-500 hover:bg-blue-700 text-white font-medium py-0.5 px-1 text-2xl rounded focus:outline-none focus:shadow-outline']")).click();
		WebElement ele = driver.findElement(By.id("password"));
        ele.sendKeys(Keys.chord("Devika"));
	}

}
