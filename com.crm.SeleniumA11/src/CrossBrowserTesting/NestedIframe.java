package CrossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(2000);
		WebElement iframe = driver.findElement(By.xpath("//section[@id='demoUI']/main/section/article/aside/div/aside/div/iframe"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		WebElement iframe2 = driver.findElement(By.xpath("//div[@class='form_container']/iframe"));
		driver.switchTo().frame(iframe2);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		Thread.sleep(2000);
		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		

	}

}
