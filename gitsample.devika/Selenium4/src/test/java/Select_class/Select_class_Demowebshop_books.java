package Select_class;



	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Select_class_Demowebshop_books 
	{

		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1] ")).click();
			//Identify the webelement(sort by)
			/*WebElement ele = driver.findElement(By.id("products-orderby"));
			//give the ref var in constructor of select class
			Select s=new Select(ele);
			//By index
			s.selectByIndex(1);      //Here, we cannot give both select by index and get options at a time org.openqa.selenium.StaleElementReferenceException
			//get options method
			List<WebElement> opt = s.getOptions();
			//iterate to print the value
			for(WebElement we:opt)
			{
				System.out.println(we.getText());
			}
			
			Thread.sleep(2000);
			//identify the webelement(display)
			WebElement ele1 = driver.findElement(By.id("products-pagesize"));
			Select s1=new Select(ele1);
			//By visible text(select which is text function)
			//s1.selectByVisibleText("12");
			List<WebElement> opt1 = s1.getOptions();
			for(WebElement we1:opt1)
			{
				System.out.println(we1.getText());
			}
			Thread.sleep(2000);
			//identify the webelement(view as)
			WebElement ele3 = driver.findElement(By.id("products-viewmode"));
			Select s2=new Select(ele3);
			//By value
			//s2.selectByIndex(1);
			List<WebElement> opt2 = s2.getOptions();
			for(WebElement we2:opt2)
			{
				System.out.println(we2.getText());
			}*/
			WebElement ele = driver.findElement(By.id("products-orderby"));//check whether the given drop down is multiselect or not
			
			Select s=new Select(ele);
			System.out.println(s.isMultiple());
		}
	}

