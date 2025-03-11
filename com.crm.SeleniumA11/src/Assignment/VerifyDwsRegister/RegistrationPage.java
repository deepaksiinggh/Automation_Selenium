package Assignment.VerifyDwsRegister;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		String expectedUrl="https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		String actualUrl=driver.getCurrentUrl();
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("I am in dws page");
			WebElement registerPage = driver.findElement(By.partialLinkText("Register"));
			registerPage.click();
			driver.findElement(By.id("gender-male")).click();
			driver.findElement(By.id("FirstName")).sendKeys("Deepak");
			driver.findElement(By.id("LastName")).sendKeys("Singh");
			driver.findElement(By.id("Email")).sendKeys("tdeepak236@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Deepak@1234");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("Deepak@1234");
			driver.findElement(By.name("register-button")).click();
			System.out.println("Registration Complete");
		}else {
			System.out.println("I am not in dws page");
		}
		Thread.sleep(2000);
		driver.close();

	}

}
