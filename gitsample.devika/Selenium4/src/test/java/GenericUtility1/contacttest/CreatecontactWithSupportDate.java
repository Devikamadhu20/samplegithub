package GenericUtility1.contacttest;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreatecontactWithSupportDate {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/DDT_data/commomdata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);

		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");

		Random random = new Random();
		int randomint = random.nextInt(1000);

		FileInputStream fis1 = new FileInputStream("./src/test/resources/DDT_data/testscriptdata1.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet("contact");
		Row row = sh.getRow(4);
		String lastName = row.getCell(2).toString() + randomint;
		wb.close();

		WebDriver driver = null;

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		 Date dateobj=new Date();
		 SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		 String startDate=sim.format(dateobj);
		 Calendar cal=sim.getCalendar();
		 cal.add(Calendar.DAY_OF_MONTH, 30);
		 String endDate = sim.format(cal.getTime());
		
		
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.name("support_start_date")).clear();
		driver.findElement(By.name("support_start_date")).sendKeys(startDate);
		System.out.println(startDate);
		driver.findElement(By.name("support_end_date")).clear();
		driver.findElement(By.name("support_end_date")).sendKeys(endDate);
	    System.out.println(endDate);
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		System.out.println("Executed");

		
		  //verify header lastname info expected result 
		  String actstartdate =driver.findElement(By.id("dtlview_Support Start Date")).getText();
		  if(actstartdate.equals(startDate))
		  { 
			  System.out.println(startDate +" is created======PASS"); 
		  } 
		  else { System.out.println(startDate +"is not created=====FAIL"); }
		 
		  String actenddate =driver.findElement(By.id("dtlview_Support End Date")).getText();
		  if(actenddate.equals(endDate))
		  { 
			  System.out.println(endDate +" is created======PASS"); 
		  } 
		  else { System.out.println(endDate +"is not created=====FAIL"); }
		 

		driver.quit();

	}

}
