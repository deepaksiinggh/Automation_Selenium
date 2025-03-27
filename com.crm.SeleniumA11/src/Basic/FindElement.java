package Basic;

import org.openqa.selenium.By;
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
			//classname locater
//			WebElement register = driver.findElement(By.className("search-box-text"));
//			register.sendKeys("Deepak Dada");
//			register.click();
			//tag name 
//			 driver.findElement(By.tagName("a")).sendKeys("Book");
			
			 //Byid
//			 driver.findElement(By.id("small-searchterms")).sendKeys("Deepak");
			 
			 //ByName
//			 driver.findElement(By.name("NewsletterEmail")).sendKeys("Deepak");
//			 by text
//			 driver.findElement(By.linkText("Shopping cart")).click();
			
//			by paragraph text
			 driver.findElement(By.partialLinkText("Shopping")).click();
		
			
		}else {
			System.out.println("I amnot in dwa page");
		}
		
		
		
		Thread.sleep(2000);
		driver.close();

	}

}
