package GenericUtility1.contacttest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateContactWithOrg {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./src/test/resources/DDT_data/commomdata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		
		
		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");
		
		Random random=new Random();
		int randomint=random.nextInt(10000);
		
		FileInputStream fis1=new FileInputStream("./src/test/resources/DDT_data/testscriptdata1.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet("contact");
		Row row = sh.getRow(7);
		String Orgname=row.getCell(2).toString()+randomint;
		
		String contactLastName=row.getCell(3).getStringCellValue();
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
       
      //verify header orgname info expected result
        String actorgname = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
        if(actorgname.contains(Orgname))
        {
     	   System.out.println(Orgname  +" is created======PASS");
        }
        else
        {
     	   System.out.println(Orgname +"is not created=====FAIL");
        }
     	   
     	 
       //navigate to contact module
         driver.findElement(By.linkText("Contacts")).click();
        
        driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys(contactLastName);
		driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
		//switch to child window
		String parent = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);

			String acturl = driver.getCurrentUrl();
			if(acturl.contains("module=Accounts"))
			{
				break;
			}
		}
		
		driver.findElement(By.id("search_txt")).sendKeys(Orgname);
		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//a[text()='"+Orgname+"']")).click();
	
//		//switch to parent window
//		Set<String> set1 = driver.getWindowHandles();
//		Iterator<String> it1 = set.iterator();
//		while(it1.hasNext()) {
//			String windowID = it1.next();
//			driver.switchTo().window(windowID);
//
//			String acturl = driver.getCurrentUrl();
//			if(acturl.contains("Contacts&action"))
//			{
//				break;
//			}
//		}
		
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();

     
     
     //verify header message expected result
       String actOrgname = driver.findElement(By.id("mouseArea_Last Name")).getText();
       if(actOrgname.contains(Orgname))
       {
    	   System.out.println(Orgname  +" is created======PASS");
       }
       else
       {
    	   System.out.println(Orgname +"is not created=====FAIL");
       }

driver.quit();
	}

	}

