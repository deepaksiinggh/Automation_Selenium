package Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSRemoveHigest {

	public static void main(String[] args) throws Exception  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		// click on Digital Download
		List<WebElement> navigationLink=driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		navigationLink.get(4).click();
		
		//Product add to cart
		List<WebElement> addToCart=driver.findElements(By.xpath("//div[@class='center-2']/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/div[2]/input"));
		
		for(WebElement pr:addToCart) {
			pr.click();
			Thread.sleep(2000);
		}
		
		// click on item-cart
		List< WebElement> headerClick = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
		headerClick.get(2).click();
		
		// find max price and index
		List< WebElement> productPrice = driver.findElements(By.xpath("//table[@class='cart']/tbody/tr/td[6]/span[2]"));
		int maxPrice=0;
		int index=0;
		for(int i=0;i<productPrice.size();i++) {
			
			String textPrice= productPrice.get(i).getText();

            
                try {
                    int price = Integer.parseInt(textPrice.replaceAll("[^0-9]", ""));
                    if (price > maxPrice) {
                        maxPrice = price;
                        index = i;
                    }
                } catch (Exception  e) {
                    System.out.println(e);
                }
            }
			
		
		// click on cheack-box where price is max
		
		 List<WebElement> removeProduct = driver.findElements(By.xpath("//table[@class='cart']/tbody/tr/td[1]/input")); 
	
			 removeProduct.get(index).click();
			 Thread.sleep(2000);
			 driver.findElement(By.name("updatecart")).click();
		
		Thread.sleep(2000);
		driver.close();

	}

}
