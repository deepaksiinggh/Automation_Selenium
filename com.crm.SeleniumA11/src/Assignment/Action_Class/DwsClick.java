package Assignment.Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DwsClick {
	
	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		Actions a1 = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement book =driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
		a1.moveToElement(book).click().perform();
		
		
	}	
}
