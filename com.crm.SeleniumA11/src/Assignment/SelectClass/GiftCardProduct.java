package Assignment.SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCardProduct {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		// click gift cart navLink
		List<WebElement> navLink = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		navLink.get(6).click();
		
		// Get all the product add to cart button
		List <WebElement> addToCartButton = driver.findElements(By.xpath("//div[@class='product-grid']/div/div/div[2]/div[3]/div[2]/input"));
		
		// get all The input field
		List <WebElement> productLabel;
		
		for(int i=0;i<addToCartButton.size();i++) {
			
			addToCartButton.get(i).click();
			Thread.sleep(2000);
			// Reinitialize getAll The input field
			productLabel= driver.findElements((By.xpath("//div[@class='giftcard']/div/label")));
			
			
			for(int j=0;j<productLabel.size();j++) {
				String text= productLabel.get(j).getText();
				if(text.equals("Recipient's Name:")) {
					 driver.findElement(By.id("giftcard_"+(i+1)+"_RecipientName")).sendKeys("Anshul");
					 Thread.sleep(1000);
				}else if(text.equals("Recipient's Email:")) {
		            driver.findElement(By.id("giftcard_"+(i+1)+"_RecipientEmail")).sendKeys("singh@gmail.com");
		            Thread.sleep(1000);
				}else if(text.equals("Your Name:")) {
					driver.findElement(By.id("giftcard_"+(i+1)+"_SenderName")).sendKeys("Deepak");
					 Thread.sleep(1000);
				}else if(text.equals("Your Email:")) {
					 driver.findElement(By.id("giftcard_"+(i+1)+"_SenderEmail")).sendKeys("deepak@gmail.com");
					 Thread.sleep(1000);
				}else if(text.equals("Message:")) {
					 driver.findElement(By.id("giftcard_"+(i+1)+"_Message")).sendKeys("I hope you will like it");
					 Thread.sleep(1000);
				}
				   
			}
			
			driver.findElement(By.id("add-to-cart-button-"+(i+1))).click();
			Thread.sleep(2000);
			driver.navigate().back();
		}
		
		driver.close();
	}}
