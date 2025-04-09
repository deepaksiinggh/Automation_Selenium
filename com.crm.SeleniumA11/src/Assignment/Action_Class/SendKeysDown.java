package Assignment.Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		
//		for(int i=1;i<=6;i++) {
//		act.keyDown(Keys.TAB).perform();
//		Thread.sleep(1000);
//		}
//		act.sendKeys("mobile").perform();
//		
		
		WebElement searchkey = driver.findElement(By.id("small-searchterms"));
		act.sendKeys(searchkey,"mobile").perform();
	}

}
