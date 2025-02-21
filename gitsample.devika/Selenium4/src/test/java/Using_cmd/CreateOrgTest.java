package Using_cmd;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateOrgTest
{
   @Test
   public void createorgtest() throws EncryptedDocumentException, IOException, InterruptedException
   {
	   //read common data from cmd line
	      String URL=System.getProperty("url");
		  String BROWSER=System.getProperty("browser");
		  String USERNAME=System.getProperty("username");
		  String PASSWORD=System.getProperty("password");
		  
		  Random random=new Random();
		  int randomInt=random.nextInt(1000);
		  
		  FileInputStream fis1=new FileInputStream("./src/test/resources/DDT_data/testscriptdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis1);
			Sheet sh = wb.getSheet("org");
			Row row = sh.getRow(1);
			String Orgname=row.getCell(2).toString()+ randomInt;
			wb.close();
	   
	   WebDriver driver=null;
		
		if(BROWSER.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else if(BROWSER.contains("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.manage().window().maximize();
       driver.findElement(By.name("user_name")).sendKeys(USERNAME);
       driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
       driver.findElement(By.id("submitButton")).click();
       driver.findElement(By.linkText("Organizations")).click();
       driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
       driver.findElement(By.name("accountname")).sendKeys(Orgname);
       driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
      
		 WebElement icon = driver.findElement(By.xpath("(//td[contains(@style,'padding-bottom:')])[1]"));
		 Actions act=new Actions(driver);
		 act.moveToElement(icon).perform();
		 Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//a[text()='Sign Out']"));
		 ele.sendKeys(Keys.ENTER);
		 driver.close();
		 
		 
   }
}
