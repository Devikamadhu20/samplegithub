package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Book_my_tickets {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://bannerughattabiopark.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='popupBoxClose']")).click();
		driver.findElement(By.xpath("(//span[@class='book_ticket'])[1]")).click();
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> it = allwh.iterator();
		String p_id = it.next();
		String c_id = it.next();
		driver.switchTo().window(c_id);
		driver.findElement(By.xpath("//a[text()='Book Ticket '] ")).click();
		Set<String> win = driver.getWindowHandles();
		Iterator<String> itt = win.iterator();
		String pid = itt.next();
		String cid = itt.next();
		String ccid = itt.next();
		driver.switchTo().window(ccid);
		WebDriverWait wait=new WebDriverWait(driver, 50);
		WebElement ele = driver.findElement(By.xpath("//div[@class='row mt-2 ng-tns-c1592718512-0']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
	    driver.findElement(By.xpath("//img[@src='https://images.bannerughattabiopark.org/mobilemainmenu/3.png']")).click();
	    WebElement ele1 = driver.findElement(By.xpath("//div[@style='overflow-y: auto; overflow-x: hidden;']"));
	    wait.until(ExpectedConditions.visibilityOf(ele1));
		 driver.findElement(By.xpath("(//img[@class='mt-3 ng-tns-c1592718512-0'])[2]")).click(); 
		 
		
	

	}

}
