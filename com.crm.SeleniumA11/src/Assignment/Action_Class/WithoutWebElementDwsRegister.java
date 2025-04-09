package Assignment.Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutWebElementDwsRegister {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions act = new Actions(driver);
		
		
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(1000);
		
		String str []= {"Deepak","Singh","deepak78@gmail.com","Deepak@1234","Deepak@1234"};
		
		for(int i=0;i<str.length;i++) {
			act.sendKeys(Keys.TAB).sendKeys(str[i]).perform();
			Thread.sleep(500);
		}
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
//		act.sendKeys(Keys.TAB).sendKeys("Deepak").perform();
//		Thread.sleep(500);
//		act.sendKeys(Keys.TAB).sendKeys("Singh").perform();  
//		Thread.sleep(500);
//		act.sendKeys(Keys.TAB).sendKeys("deepak78@gmail.com").perform();
//		Thread.sleep(500);
//		act.sendKeys(Keys.TAB).sendKeys("Deepak@1234").perform();  
//		Thread.sleep(500);
//		act.sendKeys(Keys.TAB).sendKeys("Deepak@1234").perform();   
//		Thread.sleep(500);
//		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		
		
		Thread.sleep(3000);
		driver.close();
	}
}
