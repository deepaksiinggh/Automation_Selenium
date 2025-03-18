package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyInput {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String passedData = "computer";
		Thread.sleep(2000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		 WebElement assearchField = driver.findElement(By.id("small-searchterms"));
		assearchField.sendKeys("computer");
		String getVal = assearchField.getAttribute("value");
	    
		if(passedData.equals(getVal)) {
			System.out.println("Data is sucessfully passed");
		}else {
			System.out.println("Data is not passed");
		}
		
		Thread.sleep(2000);
		driver.close();



	}

}
