package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitShopperStack {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().to("https://shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//span[(text()='Create Account')]")).click();
		

	}

}
