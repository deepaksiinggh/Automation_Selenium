package Assignment.OrangeHrmLoginButtonEnabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButton_Enabled {

	public static void main(String[] args) throws InterruptedException {
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String actualUrl= driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)) {
        	System.out.println("You are in OrangeHrm website");
        	Thread.sleep(2000);
        	driver.findElement(By.className("oxd-input")).sendKeys("Admin");
        	driver.findElement(By.name("password")).sendKeys("admin123");
        	WebElement loginButton = driver.findElement(By.cssSelector(".oxd-button.orangehrm-login-button"));
        	if(loginButton.isEnabled()) {
        		System.out.println("Button is enabled");
        		loginButton.click();
        	}
        	else {
        		System.out.println("Button is not enabled");
        	}
        }else {
        	System.out.println("You are not in orangeHrm website");
        }
		Thread.sleep(2000);
        
	}

}
