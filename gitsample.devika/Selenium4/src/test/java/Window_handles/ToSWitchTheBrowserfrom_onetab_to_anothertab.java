package Window_handles;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSWitchTheBrowserfrom_onetab_to_anothertab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demowebshop.tricentis.com/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com");
	}

}
