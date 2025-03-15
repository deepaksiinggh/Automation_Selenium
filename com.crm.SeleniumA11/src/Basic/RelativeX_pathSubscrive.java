package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeX_pathSubscrive {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Deepak");
//		driver.findElement(By.partialLinkText("Digital downloads")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();				
				

	}

}
