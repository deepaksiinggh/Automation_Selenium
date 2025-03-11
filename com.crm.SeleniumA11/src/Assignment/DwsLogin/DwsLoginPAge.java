package Assignment.DwsLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwsLoginPAge {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedTitle="Demo Web Shop";
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize screen
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//go on demowebshop website
		driver.get("https://demowebshop.tricentis.com/");
		// get actual title
		String actualTitle = driver.getTitle();
		//verification expected title and actual title
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("This is a Dws website");
			// find element by text and click login page
			driver.findElement(By.partialLinkText("Log")).click();
			// find the element by name and set the value of email field
			driver.findElement(By.name("Email")).sendKeys("tdeepak236@gmail.com");
			// find the element by name and set the value of password field
			driver.findElement(By.name("Password")).sendKeys("Deepak@1234");
			// find the element by name and click login button
			driver.findElement(By.className("login-button")).click();
			System.out.println("Login Sucessfully");
		}else {
			System.out.println("You are not in Dws Website");
		}
		Thread.sleep(2000);
		driver.close();
		

	}

}
