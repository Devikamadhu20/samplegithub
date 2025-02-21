package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class Search_textfield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver= new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.get("https://demowebshop.tricentis.com/");
         JavascriptExecutor js=(JavascriptExecutor)driver;
         //write the code in the console
         js.executeScript("document.getElementById('small-searchterms').value='computer';");
         //pass the arguments
         WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
         js.executeScript("arguments[0].click();",search);
	}

}