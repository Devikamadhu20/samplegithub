package Shadow_root_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_root_open_google_history_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("chrome://history");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		SearchContext h1 = driver.findElement(By.xpath("//body/history-app")).getShadowRoot();
	    SearchContext h2 = h1.findElement(By.cssSelector("history-toolbar[id='toolbar']")).getShadowRoot();
		SearchContext h3 = h2.findElement(By.cssSelector("cr-toolbar[id='mainToolbar']")).getShadowRoot();
		SearchContext get_host = h3.findElement(By.cssSelector("cr-toolbar-search-field[id='search']")).getShadowRoot();
		//SearchContext h4 = get_host.findElement(By.cssSelector("cr-icon-button[id='icon']")).getShadowRoot();
		get_host.findElement(By.cssSelector("input[id='searchInput']")).sendKeys("Kush");
	}
	
}
