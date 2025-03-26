package OmayoBlog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demos {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
	        
	        // Open a webpage
	        driver.get("https://example.com");

	        // Get and print page source
	        String pageSource = driver.getPageSource();
	        System.out.println(pageSource);

	        // Close the browser
	        driver.quit();

	}

}
