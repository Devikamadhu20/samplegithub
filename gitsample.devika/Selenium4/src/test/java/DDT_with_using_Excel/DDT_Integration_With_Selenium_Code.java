package DDT_with_using_Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DDT_Integration_With_Selenium_Code {

	public static void main(String[] args) throws IOException
	{

	FileInputStream fis=new FileInputStream("./src/test/resources/DDT_data/commomdata.properties");
			Properties pobj=new Properties();
			pobj.load(fis);
			
			
			String BROWSER = pobj.getProperty("browser");
			String URL = pobj.getProperty("url");
			String USERNAME = pobj.getProperty("username");
			String PASSWORD = pobj.getProperty("password");
			
			FileInputStream fis1=new FileInputStream("./src/test/resources/DDT_data/testscriptdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis1);
			Sheet sh = wb.getSheet("org");
			Row row = sh.getRow(1);
			String OrgName1=row.getCell(2).toString();
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
	        driver.findElement(By.name("accountname")).sendKeys("OrgName1");
	        driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
	       //String verify = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	       
	       //System.out.println(verify);
	       
			
			 //if(verify.contains("software solutions")) {
			  //System.out.println("verification is done"); }
			 WebElement icon = driver.findElement(By.xpath("(//td[contains(@style,'padding-bottom:')])[1]"));
			 Actions act=new Actions(driver);
			 act.moveToElement(icon).perform();
			 driver.findElement(By.linkText("Sign Out")).click();
			 driver.quit();
			 
			 
	}	        

}
