package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		   Thread.sleep(2000);
		   WebElement ele = driver.findElement(By.id("select2"));
		   Select s=new Select(ele);
		   s.selectByIndex(3);
		   Thread.sleep(1000);
		   s.deselectByIndex(3);

}
}
