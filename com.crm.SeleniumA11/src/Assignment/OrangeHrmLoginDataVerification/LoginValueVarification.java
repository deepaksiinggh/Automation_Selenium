package Assignment.OrangeHrmLoginDataVerification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValueVarification {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		String expectedUserName="Admin";
		String expectedPwd= "admin123";
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement userNameSearchField = driver.findElement(By.name("username"));
		userNameSearchField.sendKeys("Admin");
		String getUserName= userNameSearchField.getAttribute("value");
		
		WebElement pwdSearchfield = driver.findElement(By.name("password"));
		pwdSearchfield.sendKeys("admin123");
		String getPwd= pwdSearchfield.getAttribute("value");
		
		if(expectedUserName.equals(getUserName)&& expectedPwd.equals(getPwd)) {
			System.out.println("Both fields are matched you are able to login");
		}else if(expectedUserName.equals(getUserName)) {
			System.out.println("Only username matched");
		}else if(expectedPwd.equals(getPwd)) {
			System.out.println("Only password matched");
		}
		else {
			System.out.println("You are not able to login");
		}
		
		
		Thread.sleep(2000);
		driver.close();

	}

}
