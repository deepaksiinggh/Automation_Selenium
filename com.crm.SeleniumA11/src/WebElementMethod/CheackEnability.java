package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheackEnability {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement good = driver.findElement(By.className("ico-register"));
		
		if(good.isEnabled()) {
			System.out.println("Link is valid or element is enabled..");
		}else {
			System.out.println("Link is not valid or element is not enabled..");
		}
		
		Thread.sleep(2000);
		driver.close();


	}

}
