package Practice;
import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		Thread.sleep(1000); 

		List<WebElement> countryOptions = driver.findElements(By.xpath("//ul[@id='select2-country-results']/li"));
		if (countryOptions.size() > 2) {
          countryOptions.get(2).click(); 
      }
		
	
		
		
	}

	
}
