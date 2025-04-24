package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDws_Assignment {

	public static void main(String[] args) throws InterruptedException {
		String expected_Url ="https://demoapps.qspiders.com/ui?scenario=1";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[@id='optionsBody']/a")).click();
		Thread.sleep(2000);
		String actual_Url = driver.getCurrentUrl();
		
		if(expected_Url.equals(actual_Url)) {
			System.out.println("You are in real webpage");
			driver.findElement(By.xpath("//section[text()='Frames']")).click();
			driver.findElement(By.xpath("//section[text()='iframes']")).click();
			WebElement iframe = driver.findElement(By.xpath("//*[@class='w-full h-96']"));
			driver.switchTo().frame(iframe);
			Thread.sleep(1000);
			driver.findElement(By.id("username")).sendKeys("Deepak@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Deepak@1234");
			Thread.sleep(1000);
	
			driver.findElement(By.id("submitButton")).click();
			
			driver.switchTo().parentFrame();
			driver.close();
		}

	}

}
