package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStack {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.navigate().to("https://shoppersstack.com/");
		WebElement login= wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		login.click();
		WebElement creatAccount=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[(text()='Create Account')]")));
		creatAccount.click();
	
	}

}
