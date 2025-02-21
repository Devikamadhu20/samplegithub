package Scroll;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_infinite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/scroll");
		String p_id = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Set<String> c_id = driver.getWindowHandles();
		ArrayList<String> ls=new ArrayList<String>(c_id);
		String s1 = ls.get(1);
		driver.switchTo().window(s1);
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		for( ; ;)
		{
			act.scrollByAmount(0, 100);
		}
	

	}

}
