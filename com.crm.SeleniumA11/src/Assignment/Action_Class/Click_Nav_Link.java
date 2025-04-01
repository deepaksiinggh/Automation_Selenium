package Assignment.Action_Class;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Nav_Link {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Actions act=new Actions(driver);
		
		List<WebElement> navLink = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		
		for(WebElement nav:navLink) {
			act.moveToElement(nav).click().perform();
			Thread.sleep(2000);
			driver.navigate().back();
		}
		
		driver.close();

	}

}
