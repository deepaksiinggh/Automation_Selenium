package Iframe;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleIframe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");


		List<WebElement> iframes = driver.findElements(By.xpath("//div[@class='w-1/2']/iframe"));

		driver.switchTo().frame(iframes.get(0));
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		driver.findElement(By.id("submitButton")).click();
		
		driver.switchTo().defaultContent();

		driver.switchTo().frame(iframes.get(1));
		driver.findElement(By.id("username")).sendKeys("Admin@1234");
		driver.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
		driver.findElement(By.id("submitButton")).click();

	
	}
}
