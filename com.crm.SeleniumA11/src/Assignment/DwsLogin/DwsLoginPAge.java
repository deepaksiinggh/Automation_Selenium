package Assignment.DwsLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwsLoginPAge {

	public static void main(String[] args) throws InterruptedException {
		String expectedTitle="Demo Web Shop";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("This is a Dws website");
			driver.findElement(By.partialLinkText("Log")).click();
			driver.findElement(By.name("Email")).sendKeys("tdeepak236@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("Deepak@1234");
			driver.findElement(By.className("login-button")).click();
			System.out.println("Login Sucessfully");
		}else {
			System.out.println("You are not in Dws Website");
		}
		Thread.sleep(2000);
		driver.close();
		

	}

}
