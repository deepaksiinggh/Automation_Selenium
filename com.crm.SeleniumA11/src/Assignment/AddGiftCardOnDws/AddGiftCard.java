package Assignment.AddGiftCardOnDws;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddGiftCard {

	public static void main(String[] args) throws InterruptedException {
		String expectedResult = "https://demowebshop.tricentis.com/";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		String actualresult = driver.getCurrentUrl();
		if(expectedResult.equals(actualresult)) {
			System.out.println("You are in dws page");
			driver.findElement(By.cssSelector(".ico-login")).click();
			// find the element by name and set the value of email field
			driver.findElement(By.cssSelector("#Email")).sendKeys("ritesh5898@gmail.com");
			// find the element by name and set the value of password field
			driver.findElement(By.cssSelector("#Password")).sendKeys("Ritesh@1234");
			// find the element by name and click login button
			driver.findElement(By.cssSelector(".button-1.login-button")).click();
			System.out.println("Login Sucessfully");
			driver.findElement(By.cssSelector(".button-2.product-box-add-to-cart-button")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#giftcard_2_RecipientName")).sendKeys("Lavi");
			driver.findElement(By.cssSelector("#giftcard_2_RecipientEmail")).sendKeys("lavi@gmail.com");
			driver.findElement(By.cssSelector("#addtocart_2_EnteredQuantity")).clear();
			driver.findElement(By.cssSelector("#addtocart_2_EnteredQuantity")).sendKeys("2");
			driver.findElement(By.cssSelector("#add-to-cart-button-2")).click();
			System.out.println("Gift added sucessfully");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".ico-logout")).click();	
			System.out.println("Logout sucessfully");
			
		}else {
			System.out.println("You are not in dws page");
		}
			
			Thread.sleep(2000);
//			driver.close();


	}

}
