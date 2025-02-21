package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrganisation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\commomdata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		WebDriver driver=null;
		
		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");
		
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
        driver.findElement(By.name("accountname")).sendKeys("software solutions17");
        driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
       String verify = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
       
       System.out.println(verify);
       
		
		 if(verify.contains("software solutions")) {
		  System.out.println("verification is done"); }
		 WebElement icon = driver.findElement(By.xpath("(//td[contains(@style,'padding-bottom:')])[1]"));
		 Actions act=new Actions(driver);
		 act.moveToElement(icon).perform();
		 driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		 
		 
        
        
        
	}

}
