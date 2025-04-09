package NotificationPopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendValueByRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).click();
		Thread.sleep(1500);
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_D);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_E);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_E);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_P);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_K);
		
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		

	}
}
