package Assignment.Action_Class;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PressKey {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_UP).perform();
		
		

	}

}
