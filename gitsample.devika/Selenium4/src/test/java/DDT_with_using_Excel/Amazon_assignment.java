package DDT_with_using_Excel;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_assignment {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://www.amazon.in/");
	  WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
	  ele.sendKeys("iphone 15");
	  ele.sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
      List<WebElement> pro_name = driver.findElements(By.xpath("//span[@class='a-price-whole']/../../../../../../../../../../div/a"));
	  int p_size = pro_name.size();
	  System.out.println(p_size);
	  Thread.sleep(2000);
	  List<WebElement> p_prize = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	  int prize_size = p_prize.size();
	  System.out.println(prize_size);
	  Thread.sleep(2000);
	  List<WebElement> p_ratings = driver.findElements(By.xpath("//i[@class='a-icon a-icon-star-small a-star-small-4-5']"));
      int pro_ratings = p_ratings.size();
      System.out.println(pro_ratings);
      
      FileInputStream fis=new FileInputStream("./src/test/resources/DDT_data/Amazon.xlsx");
      Workbook wb=WorkbookFactory.create(fis);
      Sheet sh = wb.getSheet("Amazon Application");
      for(int i=1;i<p_size;i++)
      {
    	  Row row = sh.getRow(i);
          Cell cel = row.createCell(0);
          String text = pro_name.get(i).getText();
          cel.setCellValue(text);
          
      }
      for(int i=1;i<prize_size;i++)
      {
    	  Row row = sh.getRow(i);
          Cell cel = row.createCell(0);
          String text1 = p_prize.get(i).getText();
          cel.setCellValue(text1);
          
      }
      for(int i=1;i<pro_ratings;i++)
      {
    	  Row row = sh.getRow(i);
          Cell cel = row.createCell(0);
          String text2 = p_ratings.get(i).getText();
          cel.setCellValue(text2);
          
      }
      
      FileOutputStream fos=new FileOutputStream("./src/test/resources/DDT_data/Amazon.xlsx");
      wb.write(fos);
      wb.close();
      System.out.println("done");
      driver.close();
      
      
      
	}

	
		
	}


