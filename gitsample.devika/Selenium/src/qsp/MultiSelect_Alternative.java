package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect_Alternative {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		   Thread.sleep(3000);
		   WebElement ele = driver.findElement(By.id("select-multiple-native"));
		   Select s=new Select(ele);
		   int count = s.getOptions().size();
		   for(int i=0;i<count;i++)
		   {
			   if(i %2==0)
			   {
				   s.selectByIndex(i);
				   
			   }
		   }
		   
}
}
