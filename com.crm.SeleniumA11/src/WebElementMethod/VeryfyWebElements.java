package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeryfyWebElements {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement good = driver.findElement(By.id("pollanswers-2"));
		good.click();
		if(good.isSelected()) {
			System.out.println("Web element selected..");
		}else {
			System.out.println("Web element not selected...");
		}
		
		Thread.sleep(2000);
		driver.close();

	}

}
