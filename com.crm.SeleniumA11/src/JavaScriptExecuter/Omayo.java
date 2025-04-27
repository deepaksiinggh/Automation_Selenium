package JavaScriptExecuter;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Omayo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(30,500);");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollTo(0,-1000)");
		
		WebElement findbtn = driver.findElement(By.className("dropbtn"));
		js.executeScript("arguments[0].scrollIntoView(true);", findbtn);
	}

}
