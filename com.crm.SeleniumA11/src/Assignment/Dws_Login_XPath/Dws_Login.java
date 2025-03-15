package Assignment.Dws_Login_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dws_Login {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedTitle="Demo Web Shop";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("This is a Dws website");
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/input")).sendKeys("trtbhai@gmail.com");
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[3]/input")).sendKeys("RtBhai@9294");
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/input")).click();
			System.out.println("Login Sucessfully");
		}else {
			System.out.println("You are not in Dws Website");
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
