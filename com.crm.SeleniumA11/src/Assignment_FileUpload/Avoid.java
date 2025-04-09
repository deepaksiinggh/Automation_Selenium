package Assignment_FileUpload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Avoid {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		
		Thread.sleep(2000);
		WebElement findByInput= driver.findElement(By.xpath("//input[@type='file']"));
		findByInput.sendKeys("C:\\Users\\tdeep\\Documents\\Panni.docx");


	}

}
