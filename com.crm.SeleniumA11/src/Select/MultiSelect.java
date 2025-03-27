package Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {


		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("file:///C:/Users/tdeep/Downloads/demo.html");
			Thread.sleep(2000);
			WebElement single = driver.findElement(By.id("multiple_cars"));
			Select sel = new Select(single);
			sel.selectByVisibleText("Jaguar");
			
			Thread.sleep(2000);
			sel.selectByValue("lr");
			Thread.sleep(2000);
			sel.selectByIndex(7);
			Thread.sleep(2000);
			sel.deselectByIndex(7);
			Thread.sleep(2000);
			sel.deselectByValue("lr");
			Thread.sleep(2000);
			sel.deselectByVisibleText("Jaguar");
			}


	}


