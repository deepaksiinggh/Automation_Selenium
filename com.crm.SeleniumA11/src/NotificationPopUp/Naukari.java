package NotificationPopUp;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukari {

	public static void main(String[] args) throws InterruptedException {
		
		String expected_Url="https://www.naukri.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.naukri.com/");
		String actua_Url = driver.getCurrentUrl();
		Actions act = new Actions(driver);
		
		
		
		// Validation by url
		
		
		if(actua_Url.equals(expected_Url)) {
			System.out.println("You are in Naukari page");
			
			// Register button click
			driver.findElement(By.id("register_Layer")).click();
			Thread.sleep(1000);
			
			// send Name value
			driver.findElement(By.id("name")).sendKeys("Deepak");
			Thread.sleep(1000);
			
			// send Email value
			driver.findElement(By.id("email")).sendKeys("deepak@gmail.com");
			Thread.sleep(1000);
			
			// send password value
			driver.findElement(By.id("password")).sendKeys("deepak@1234");		
			Thread.sleep(1000);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			// send Number value
			driver.findElement(By.id("mobile")).sendKeys("8875845246");	
			Thread.sleep(1000);
			
			// send Number value
			driver.findElement(By.xpath("//div[@class='radioWrap']/div")).click();	
			Thread.sleep(1000);
			
			// resume upload
			WebElement uploadResume= driver.findElement(By.xpath("//input[@type='file']"));
			uploadResume.sendKeys("C:\\\\Users\\\\tdeep\\\\Documents\\\\Panni.docx");
			Thread.sleep(1000);
			
			//Button click 
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			
		}else {
			System.out.println("You are not in Naukari Page");
		}

	}

}
