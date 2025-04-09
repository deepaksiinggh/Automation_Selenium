package Assignment.Action_Class;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jackets {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		Actions a1 = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.myntra.com/");
		Thread.sleep(2000);
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		Thread.sleep(2000);
		a1.moveToElement(men).perform();
		 driver.findElement(By.xpath("//a[text()='Jackets']")).click();
	
	
		
	
	}

}
