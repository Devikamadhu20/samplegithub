package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_simple_Alert {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demowebshop.tricentis.com/");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
         Alert ale = driver.switchTo().alert();
         Thread.sleep(2000);
         ale.accept();
	}

}
