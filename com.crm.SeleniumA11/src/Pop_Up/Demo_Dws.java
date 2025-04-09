package Pop_Up;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Dws {

	public static void main(String[] args) throws InterruptedException {
		
		String newWindowUrl = "https://demoapps.qspiders.com/ui/browser?sublist=0";
		String newTab = "https://demoapps.qspiders.com/ui/browser/newTab?sublist=1";
		String multipleWindows = "https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2";
		String multipleTabs = "https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demoapps.qspiders.com/");
		
		String parent = driver.getWindowHandle();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();

		List<WebElement> navLink = driver.findElements(By.xpath("//div[@class='pt-16']/div/ul/li"));

		for(WebElement navCl : navLink) {
			navCl.click();
			Thread.sleep(2000);
			String actualUrl = driver.getCurrentUrl();
			System.out.println(actualUrl);

			if(actualUrl.equals(newWindowUrl)) {
				driver.findElement(By.id("browserLink1")).click();
			} else if (actualUrl.equals(newTab)) {
				driver.findElement(By.id("browserButton4")).click();
			} else if (actualUrl.equals(multipleWindows)) {
				driver.findElement(By.id("browserButton3")).click();
			} else if (actualUrl.equals(multipleTabs)) {
				driver.findElement(By.id("browserButton2")).click();
			}
			
			Thread.sleep(2000);
			Set<String> allWindows = driver.getWindowHandles();
			allWindows.remove(parent);
			for(String windows : allWindows) {
					driver.switchTo().window(windows);
					Thread.sleep(4000);
						driver.findElement(By.id("email")).sendKeys("deepak@gmail.com");
						driver.findElement(By.id("password")).sendKeys("9294845246");
						driver.findElement(By.id("confirm-password")).sendKeys("9294845246");
						Thread.sleep(3000);
					driver.switchTo().window(parent);
				}
		}Thread.sleep(3000);
			driver.quit();
		}

		
	}

