package CrossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class CrossBrowser {
	static WebDriver driver=null;

	public static void preCondition(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
		 driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("ie")) {
			 driver = new InternetExplorerDriver();
		}else {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
	
	}
	

}
