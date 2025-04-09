package Pop_Up;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		String expectedUrl="https://www.facebook.com/nopCommerce";
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		Thread.sleep(3000);
	
		Set<String> child =driver.getWindowHandles();
		System.out.println(child);
		child.remove(parent);
		for(String str:child) {
			driver.switchTo().window(str);
			String actualUrl=driver.getCurrentUrl();
			if(expectedUrl.equals(actualUrl)) {
				driver.findElement(By.xpath("//div[@aria-label='Create new account']")).click();
			}
		}
		
		
		
	}

}
