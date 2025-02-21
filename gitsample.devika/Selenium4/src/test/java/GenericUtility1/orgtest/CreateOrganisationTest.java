package GenericUtility1.orgtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

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

public class CreateOrganisationTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/DDT_data/commomdata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		
		
		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");
		
		Random random=new Random();
		int randomint=random.nextInt(1000);
		
		FileInputStream fis1=new FileInputStream("./src/test/resources/DDT_data/testscriptdata1.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet("org");
		Row row = sh.getRow(1);
		String Orgname=row.getCell(2).toString()+randomint;
		wb.close();
		
		WebDriver driver=null;
		
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("firefox"))
		{
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
       
	//verify header message expected result
       String headerInfo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
       if(headerInfo.contains(Orgname))
       {
    	   System.out.println(Orgname  +" is created======PASS");
       }
       else
       {
    	   System.out.println(Orgname +"is not created=====FAIL");
       }

     //verify header orgname info expected result
       String actorgname = driver.findElement(By.id("dtlview_Organization Name")).getText();
       if(actorgname.contains(Orgname))
       {
    	   System.out.println(Orgname  +" is created======PASS");
       }
       else
       {
    	   System.out.println(Orgname +"is not created=====FAIL");
       }

	}

}
