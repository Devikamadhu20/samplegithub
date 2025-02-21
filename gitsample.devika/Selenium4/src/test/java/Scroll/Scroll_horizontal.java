package Scroll;

import java.time.Duration;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_horizontal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/scroll/newHorizontal?scenario=1");
		String p_id = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Set<String> c_id = driver.getWindowHandles();
		TreeSet<String>ts=new TreeSet<String>(c_id);
		String hori = ts.getFirst();
		driver.switchTo().window(hori);
		Actions act=new Actions(driver);
		act.scrollByAmount(500, 0).perform();

	}

}
