package Assignment.Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html#google_vignette");
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		WebElement rom = driver.findElement(By.id("box6"));
		WebElement etly = driver.findElement(By.id("box106"));
		act.clickAndHold(rom).release(etly).perform();

	}

}
