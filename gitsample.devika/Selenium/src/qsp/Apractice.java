package qsp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apractice {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple phone 16 pro max");
	    Thread.sleep(2000);
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//img[@alt='iPhone 16 Pro Max 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Wo...']")).click();
        Thread.sleep(2000);
        Set<String> allwh = driver.getWindowHandles();
        ArrayList<String> ls=new ArrayList<String>(allwh);
        driver.switchTo().window(ls.get(1));
        Thread.sleep(2000);
        Generic_Screenshot.getPhoto(driver);
        Thread.sleep(2000);
        driver.switchTo().window(ls.get(0));
        Generic_Screenshot.getPhoto(driver);
        driver.close();
	}

}
