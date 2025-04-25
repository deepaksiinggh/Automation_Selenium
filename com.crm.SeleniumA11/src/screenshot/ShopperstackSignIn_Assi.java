package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ShopperstackSignIn_Assi {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		LocalDateTime time = LocalDateTime.now();
		String currentTimeDate=time.toString().replace(":", "-");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Create Account")).click();
		Boolean elem = driver.findElement(By.id("Register")).isEnabled();
		Thread.sleep(2000);
		if(!elem) {
			
			System.out.println("Register button not enabled .........");
			
		}else {
			System.out.println("Register button sucessfull..............");
			TakesScreenshot sc = (TakesScreenshot) driver;
			File from = sc.getScreenshotAs(OutputType.FILE);
			File to = new File("C:\\Users\\tdeep\\git\\Automation_Selenium\\com.crm.SeleniumA11\\Screenshot\\SopperStackRegister"+currentTimeDate+".png");
			FileHandler.copy(from, to);
		}

	}

}
