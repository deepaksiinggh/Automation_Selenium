package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ShopperstackLogin_Assi {

	public static void main(String[] args) throws IOException, InterruptedException {
		String expected_Url="https://www.shoppersstack.com/";
		WebDriver driver = new ChromeDriver();
		LocalDateTime time = LocalDateTime.now();
		String currentTimeDate=time.toString().replace(":", "-");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("tdeepak@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("ShopperStack@92");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
        String actual_Url = driver.getCurrentUrl();
		if(expected_Url.equals(actual_Url)) {
			
			System.out.println("Login sucessfull.........");
			
		}else {
			System.out.println("Login is not sucessfull..............");
			TakesScreenshot sc = (TakesScreenshot) driver;
			File from = sc.getScreenshotAs(OutputType.FILE);
			File to = new File("C:\\Users\\tdeep\\git\\Automation_Selenium\\com.crm.SeleniumA11\\Screenshot\\SopperStack"+currentTimeDate+".png");
			FileHandler.copy(from, to);
		}
	}

}
