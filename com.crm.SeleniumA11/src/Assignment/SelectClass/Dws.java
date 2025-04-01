package Assignment.SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dws {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		List< WebElement> lwe=driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li"));
		String expectedDate="https://demowebshop.tricentis.com/news/rss/1";
		for(WebElement we:lwe) {
			Thread.sleep(2000);
			String actualData= driver.getCurrentUrl();
			we.click();

			if(expectedDate.equals(actualData)) {
				driver.navigate().back();
			}
			Thread.sleep(2000);

	}

}}
