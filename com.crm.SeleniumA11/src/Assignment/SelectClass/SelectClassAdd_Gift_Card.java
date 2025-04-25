package Assignment.SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClassAdd_Gift_Card {

	public static void main(String[] args) throws InterruptedException {
		String expectedTitle="Demo Web Shop";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
	
		driver.get("https://demowebshop.tricentis.com/");
		// get actual title
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("This is a Dws website");
			
			driver.findElement(By.cssSelector(".ico-login")).click();
			
			driver.findElement(By.cssSelector("#Email")).sendKeys("ritesh5898@gmail.com");
			
			driver.findElement(By.cssSelector("#Password")).sendKeys("Ritesh@1234");
			
			driver.findElement(By.cssSelector(".button-1.login-button")).click();
			System.out.println("Login Sucessfully");
		}else {
			System.out.println("You are not in Dws Website");
		}
		
		List<WebElement> navLink = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		navLink.get(6).click();
		
		List <WebElement> addToCartButton = driver.findElements(By.xpath("//div[@class='product-grid']/div/div/div[2]/div[3]/div[2]/input"));
		
		for(int i=0;i<addToCartButton.size();i++) {
			
			addToCartButton.get(3).click();
			Thread.sleep(2000);
				driver.findElement(By.id("giftcard_4_RecipientName")).sendKeys("Deepak");
				driver.findElement(By.id("giftcard_4_SenderName")).sendKeys("singhygy");
				driver.findElement(By.id("giftcard_4_Message")).sendKeys("suhuugu");
				driver.findElement(By.id("add-to-cart-button-4")).click();
				Thread.sleep(2000);
				driver.navigate().back();
			
			
			
		}
       }
	}


