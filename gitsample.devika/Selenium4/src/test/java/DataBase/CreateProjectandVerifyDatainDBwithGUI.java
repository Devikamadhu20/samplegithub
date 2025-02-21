package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.mysql.jdbc.Driver;

public class CreateProjectandVerifyDatainDBwithGUI {

	public static void main(String[] args) throws SQLException, InterruptedException {
		//Create project in GUI using selenium code
		String ProjectName="BUYNOW_001";
		WebDriver driver=new ChromeDriver();
		driver.get("http://49.249.28.218:8091/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.linkText("Projects")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		driver.findElement(By.name("projectName")).sendKeys("ProjectName");
		driver.findElement(By.name("createdBy")).sendKeys("Madhu");
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.xpath("//form[@action='#']/div[2]/div[4]/select"));
		Select s=new Select(ele);
		ele.click();
		Thread.sleep(1000);
		
		s.selectByVisibleText("Created");
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		
		
		//verify the project in Backend[DB] using JDBC
		String expectedProjectName="wish_02";
		Connection conn=null;
		try {
		   boolean flag=false;
		   Driver driverRef=new Driver();
	       DriverManager.registerDriver(driverRef);
	        conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
	       System.out.println("------Done-----");
	       Statement stat=conn.createStatement();ResultSet resultset = stat.executeQuery("select * from project");
	       while(resultset.next()) {
	    	   String actualProjectName = resultset.getString(4);
	    	   if(expectedProjectName.equals(actualProjectName))
	    	   {
	    		   flag=true;
	    		   System.out.println(expectedProjectName+"is available====PASS");
	    	   }
	       }
	       if(flag==false)
	       {
	    	   System.out.println(expectedProjectName+"is not available====FAIL");
	    	   //Assert.fail();
	       }
		}
		catch(Exception e)
		{
			System.out.println("handle exception");
		}
		finally {
	       conn.close();
			}
	}


	}


