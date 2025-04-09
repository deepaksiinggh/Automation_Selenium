package Pop_Up;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

		
		public static void main(String[] args) throws InterruptedException {
			
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			
			String expected_facebook = "https://www.facebook.com/nopCommerce";
			String parent = driver.getWindowHandle();
			System.out.println(parent); 
			
			String expected_twitter = "https://x.com/nopCommerce";
			String expected_youtube = "https://www.youtube.com/user/nopCommerce";
			String expected_rss = "https://demowebshop.tricentis.com/news/rss/1";
			String expected_google = "https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html";
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			
			Thread.sleep(2000);
			List<WebElement> Weblist = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		     for(WebElement Web : Weblist) {
		    	 
		    	 Web.click();
		    	String actual_rss = driver.getCurrentUrl();
		    	    
		    	if(expected_rss.equals(actual_rss)) {
		    		driver.navigate().back();
		    	}
		    	
		     }
		    		 Thread.sleep(3000);
		    		 
		    		
						Set<String> childs = driver.getWindowHandles();
						
						for (String str : childs) {
							
							driver.switchTo().window(str);
							String actual_facebook = driver.getCurrentUrl();
							
							String actual_twitter = driver.getCurrentUrl();
							String actual_youtube= driver.getCurrentUrl();
							String actual_google = driver.getCurrentUrl();
							if(expected_facebook.equals(actual_facebook)) {
								
								 driver.findElement(By.xpath("//div[@aria-label='Create new account']")).click();
								// driver.switchTo().window(str);
								 Thread.sleep(1000);
							}
							
							else if(expected_twitter.equals(actual_twitter)) {
								
								  driver.findElement(By.xpath("//span[text()='Create account']")).click();
								// driver.switchTo().window(str);
								Thread.sleep(1000);
							}
							else if(expected_youtube.equals(actual_youtube)) {
								
								driver.findElement(By.name("search_query")).sendKeys("mobile");
								// driver.switchTo().window(str);
								Thread.sleep(1000);
							}
							else if(expected_google.equals(actual_google)) {
								
								driver.findElement(By.id("mce-EMAIL")).sendKeys("rutik");
								
							//	driver.switchTo().window(str);
								Thread.sleep(1000);
							}
						}}}
