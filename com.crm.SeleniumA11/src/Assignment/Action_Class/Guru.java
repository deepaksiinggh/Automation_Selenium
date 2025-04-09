package Assignment.Action_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru {

	public static void main(String[] args) throws Exception  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement copy=driver.findElement(By.xpath("//span[text()='Copy']"));
		WebElement doubleClick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		act.contextClick(rightClick).click(copy).perform();
//        Thread.sleep(2000);
//        try {
//        	rightClick.click();
//        	System.out.println("pop is not present");
//			
//		} catch (Exception e) {
//			System.out.println("Pop-up is present");
//		}
        
		act.doubleClick(doubleClick).click(copy).perform();
		Thread.sleep(2000);
     try {
     	doubleClick.click();
      	System.out.println("pop is not present");
			
		} catch (Exception e) {
			System.out.println("Pop-up is present");
	}
        
        
	}

}
