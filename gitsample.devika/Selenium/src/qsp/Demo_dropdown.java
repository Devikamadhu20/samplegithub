package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		   Thread.sleep(2000);
		  /* WebElement ele = driver.findElement(By.id("select2"));
		   Select s=new Select(ele);
		   s.selectByIndex(3);
		   
		   driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		   Thread.sleep(3000);
		   WebElement ele1 = driver.findElement(By.id("select-multiple-native"));
		  Select s1=new Select(ele1);
                s1.selectByIndex(0);
                s1.selectByIndex(1);
                */
                
            driver.findElement(By.xpath("//a[text()='Search With Select']")).click();
            Thread.sleep(5000);
            WebElement ele2=driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
            ele2.sendKeys("male");
            
            
            //driver.findElement(By.xpath("//a[text()='Search With Select']")).click();
                
                
             
                
                
                
                
}
}
