package Pop_Up;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dws_Page {

    public static void main(String[] args) throws InterruptedException {
        String expectedUrl = "https://demowebshop.tricentis.com/";
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(expectedUrl);
        Thread.sleep(2000);

        String actualUrl = driver.getCurrentUrl();
        if (!actualUrl.equals(expectedUrl)) {
            System.out.println("You are NOT on DWS page");
            driver.quit();
        }

        System.out.println("You are on DWS page");

        String parentWindow = driver.getWindowHandle();

        List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));

        for (WebElement link : links) {
           
            link.click();
          
        }
        Thread.sleep(3000); 
            Set<String> child = driver.getWindowHandles();
            child.remove(parentWindow);
            System.out.println(child);
            for(String str: child)
            {
            	driver.switchTo().window(str);
            	String actual_urlString = 
            }
            
            
         
    }
}
