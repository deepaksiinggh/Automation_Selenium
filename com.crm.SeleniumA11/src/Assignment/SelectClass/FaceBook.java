package Assignment.SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page&entry_point=login");
		Thread.sleep(2000);
		List<WebElement> input  =driver.findElements(By.xpath("//div[@id='fullname_field']/div/div/div/div/input"));
		
		input.get(0).sendKeys("Deepak");
		input.get(1).sendKeys("Singh");
		
		
		List<WebElement> dateInput = driver.findElements(By.xpath("//span[@class='_5k_4']/span/select"));
		   Select daySelect = new Select(dateInput.get(0));
	        daySelect.selectByVisibleText("24");
	        
	       
	         Select monthSelect = new Select(dateInput.get(1)); 
	         monthSelect.selectByVisibleText("May");

	         Select yearSelect = new Select(dateInput.get(2));
	         yearSelect.selectByVisibleText("2000");
	         List<WebElement> genderInput = driver.findElements(By.xpath("//span[@class='_5k_3']/span/label/input"));
	         System.out.println(genderInput);
	         Select genderSelect = new Select(genderInput.get(0));
	         genderSelect.selectByIndex(1);
	         

       
	}

}
