package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hidden_element {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/progress/hidden?sublist=5");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter time in seconds']"))).sendKeys("6");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Start']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Reset']"))).click();

	}

}
