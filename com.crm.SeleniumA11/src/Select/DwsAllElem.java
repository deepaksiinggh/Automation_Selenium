package Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DwsAllElem {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement digitaldwn = driver.findElement(By.xpath("//ul[@class='top-menu']/li[5]"));
		digitaldwn.click();
		
		Thread.sleep(3000);
		WebElement single = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(single);
		List<WebElement> cars = sel.getOptions();
		int i=0;
		for(WebElement web:cars) {
			single = driver.findElement(By.id("products-orderby"));
			sel = new Select(single);
			sel.selectByIndex(i++);
			Thread.sleep(1000);
		}
		
		}

}
