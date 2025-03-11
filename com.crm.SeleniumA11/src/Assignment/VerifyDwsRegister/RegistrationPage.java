package Assignment.VerifyDwsRegister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedUrl="https://demowebshop.tricentis.com/";
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//go on demowebshop website
		driver.get("https://demowebshop.tricentis.com/");
		// get actualtitle
		String actualUrl=driver.getCurrentUrl();
		// validation between expected url and actual url
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("I am in dws page");
			// find the element by partialLinktext and click on register page
			 driver.findElement(By.partialLinkText("Register")).click();
			// find the element by id and click on male radio field
			driver.findElement(By.id("gender-male")).click();
			// set the fristName field
			driver.findElement(By.id("FirstName")).sendKeys("Deepak");
			// set the LastName field
			driver.findElement(By.id("LastName")).sendKeys("Singh");
			// set the email field
			driver.findElement(By.id("Email")).sendKeys("tdeepak236@gmail.com");
			// set the password field
			driver.findElement(By.id("Password")).sendKeys("Deepak@1234");
			// set the password field
			driver.findElement(By.id("ConfirmPassword")).sendKeys("Deepak@1234");
			// click on register button
			driver.findElement(By.name("register-button")).click();
			System.out.println("Registration Complete");
		}else {
			System.out.println("I am not in dws page");
		}
		Thread.sleep(2000);
		driver.close();

	}

}
