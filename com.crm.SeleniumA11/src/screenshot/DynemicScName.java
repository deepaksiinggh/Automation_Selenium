package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DynemicScName {

public static void main(String[] args) throws IOException {
		
		String expectedUrl ="https://demowebshop.tricentis.com/";
		String email="deepak@gmail.com";
		String pwd ="Deeapk@9294";
		LocalDateTime date = LocalDateTime.now();
		String realdate =date.toString().replace(":", "-");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		
		String actualUrl = driver.getCurrentUrl();
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Login is sucessfull ......");
		}else {
			System.out.println("Login is unsucessfull .....");
			File from = driver.getScreenshotAs(OutputType.FILE);
			File to = new File(System.getProperty("user.dir") + "\\Screenshot\\Demo"+realdate+".png");
			FileHandler.copy(from, to);
		}
		
		
 
	}
}
