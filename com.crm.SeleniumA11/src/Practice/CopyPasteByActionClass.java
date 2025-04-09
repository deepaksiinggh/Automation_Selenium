package Practice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteByActionClass {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://text-compare.com/");
	
	Thread.sleep(2000);
	WebElement fristTextInput = driver.findElement(By.id("inputText1"));
	WebElement secondTextInput = driver.findElement(By.id("inputText2"));
	
	fristTextInput.sendKeys("Deepak is good boy");
	Actions act = new Actions(driver);
	
	

	}

}
