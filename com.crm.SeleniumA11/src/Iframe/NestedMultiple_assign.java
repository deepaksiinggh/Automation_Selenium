package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedMultiple_assign {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=3");
		WebElement iframe1 = driver.findElement(By.xpath("//section[@id='demoUI']/main/section/article/aside/div/aside/div/iframe"));
		driver.switchTo().frame(iframe1);
		WebElement iframe2 = driver.findElement(By.xpath("//div[@class='frame-content']/section/div[2]/iframe"));
		driver.switchTo().frame(iframe2);
		WebElement iframe3 = driver.findElement(By.xpath("//div[@class='form-group']/iframe"));
		driver.switchTo().frame(iframe3);
		
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");

	}

}
