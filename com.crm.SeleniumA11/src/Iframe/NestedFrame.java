package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		WebElement nestedIframe = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
		driver.switchTo().frame(nestedIframe);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Deepak");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		
}
}