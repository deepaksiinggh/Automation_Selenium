package Assignment.Action_Class;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DynamicClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html#google_vignette");
		Actions act=new Actions(driver);
	
		List<WebElement> len = driver.findElements(By.xpath("//div[@id='dropContent']/div"));
		for(int i=1;i<=len.size();i++) {
			WebElement cap = driver.findElement(By.id("box"+i));
			WebElement country = driver.findElement(By.id("box10"+i));
			Thread.sleep(1000);
			act.clickAndHold(cap).click(country).perform();
			Thread.sleep(1000);
		}

	}

}
