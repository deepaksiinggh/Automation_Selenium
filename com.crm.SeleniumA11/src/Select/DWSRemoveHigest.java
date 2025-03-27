package Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSRemoveHigest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> navigationLink=driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		navigationLink.get(4).click();
		
		List<WebElement> addToCart=driver.findElements(By.xpath("//div[@class='center-2']/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/div[2]/input"));
		
		for(WebElement pr:addToCart) {
			pr.click();
			Thread.sleep(2000);
		}
		List< WebElement> er = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
		er.get(2).click();
		
		List< WebElement> productPrice = driver.findElements(By.xpath("//table[@class='cart']/tbody/tr/td[6]/span[2]"));
		int maxPrice=0;
		int index=0;
		for(int i=0;i<productPrice.size();i++) {
			String textPrice= productPrice.get(i).getText();

            if (!textPrice.isEmpty()) {
                try {
                    int price = Integer.parseInt(textPrice.replaceAll("[^0-9]", ""));
                    if (price > maxPrice) {
                        maxPrice = price;
                        index = i;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid price format: " + textPrice);
                }
            }
			
			
		}
		
		
		 List<WebElement> removeButtons = driver.findElements(By.xpath("//table[@class='cart']/tbody/tr/td[1]/input"));
		 System.out.println(removeButtons.size());
		 
		 if(!removeButtons.isEmpty()) {
			 removeButtons.get(index).click();
			 driver.findElement(By.name("updatecart")).click();
		 }
		
		
		Thread.sleep(2000);
		driver.close();

	}

}
