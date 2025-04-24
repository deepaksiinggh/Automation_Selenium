package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		Thread.sleep(1000);
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("send-sms-iframe");
		WebElement iframe = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("regEmail")).sendKeys("9294845246");
	  
	   driver.switchTo().parentFrame();
		driver.findElement(By.id("hamburger")).click();
	}

}
