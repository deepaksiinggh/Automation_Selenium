package Assignment.SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClassAdd_Gift_Card {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		
		List<WebElement> navLink = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		navLink.get(6).click();
		
		List <WebElement> addToCartButton = driver.findElements(By.xpath("//div[@class='product-grid']/div/div/div[2]/div[3]/div[2]/input"));
		
		for(int i=0;i<addToCartButton.size();i++) {
			
			addToCartButton.get(i).click();
			if(i<2) {
            driver.findElement(By.id("giftcard_"+(i+1)+"_RecipientName")).sendKeys("Deepak");
            driver.findElement(By.id("giftcard_"+(i+1)+"_RecipientEmail")).sendKeys("singh@gmail.com");
            driver.findElement(By.id("giftcard_"+(i+1)+"_SenderName")).sendKeys("singhygy");
            driver.findElement(By.id("giftcard_"+(i+1)+"_SenderEmail")).sendKeys("singhyghuhuy@gmail.com");
            driver.findElement(By.id("giftcard_"+(i+1)+"_Message")).sendKeys("suhuugu");
            driver.findElement(By.id("add-to-cart-button-"+(i+1))).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			}else { 
				
				driver.findElement(By.id("giftcard_"+(i+1)+"_RecipientName")).sendKeys("Deepak");
				driver.findElement(By.id("giftcard_"+(i+1)+"_SenderName")).sendKeys("singhygy");
				driver.findElement(By.id("giftcard_"+(i+1)+"_Message")).sendKeys("suhuugu");
				driver.findElement(By.id("add-to-cart-button-"+(i+1))).click();
				Thread.sleep(2000);
				driver.navigate().back();
				
			}
			
		}
       }
	}


