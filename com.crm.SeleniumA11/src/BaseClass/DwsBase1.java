package BaseClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DwsBase1 {
	public static WebDriver driver=null;


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
	
	public static void login() {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("Lavi7898@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Lavi7898");
		driver.findElement(By.className("login-button")).click();
		
	}
	
	public static void logout() {
		driver.findElement(By.className("ico-logout")).click();
	}
	
	public static void postCondition() {
		driver.close();
	}
	
	public static void postCondition2() {
		driver.quit();
	}
	
}
