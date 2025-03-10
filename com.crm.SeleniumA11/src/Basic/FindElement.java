package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		String expectedurl="https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		String actual = driver.getCurrentUrl();
		
		if(expectedurl.equals(actual)) {
			System.out.println("I am in dwa page");
			WebElement register = driver.findElement(By.className("ico-register"));
			register.click();
		}else {
			System.out.println("I amnot in dwa page");
		}
		
		
		
		Thread.sleep(2000);
		driver.close();

	}

}
