package Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectNav {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		List< WebElement> er = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
		for(WebElement el:er) {
			
			el.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}

	}

}
