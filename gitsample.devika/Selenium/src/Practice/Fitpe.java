package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fitpe {

	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://fitpeo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
		WebElement Field = driver.findElement(By.xpath("//h4[text()='Medicare Eligible Patients']"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Field));
		Point loc = Field.getLocation();
		int x = loc.getX();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+",0)");
		WebElement ele = driver.findElement(By.xpath("//input[@type='range']"));
        Actions act=new Actions(driver);
        act.dragAndDropBy(ele, -200, 0).perform();
        act.dragAndDropBy(ele, 124, 0).perform();
          WebElement check = driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-129j43u']"));
          check.click();
          Robot r=new Robot();
          for( int i=0;i<=4;i++);
          {
          r.keyPress(KeyEvent.VK_BACK_SPACE);
          r.keyRelease(KeyEvent.VK_BACK_SPACE);
          r.keyPress(KeyEvent.VK_BACK_SPACE);
          r.keyRelease(KeyEvent.VK_BACK_SPACE);
          r.keyPress(KeyEvent.VK_BACK_SPACE);
          r.keyRelease(KeyEvent.VK_BACK_SPACE);
          }
          wait.until(ExpectedConditions.visibilityOf(check));
        driver.findElement(By.id(":r9:")).sendKeys("500");
        
        WebElement cb = driver.findElement(By.xpath("//p[text()='CPT-99091']"));
        Point ch = cb.getLocation();
        int yy = ch.getY();
        js.executeScript("window.scrollBy(0,"+yy+")");
        
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
        
        WebElement ele3 = driver.findElement(By.xpath("//p[text()='Total Recurring Reimbursement for all Patients Per Month:']"));
        boolean b = ele3.isDisplayed();
        if(b)
        {
        	System.out.println("element is displayed");
        }
        else
        {
        	System.out.println("element is not displayed");
        }
	}

}
