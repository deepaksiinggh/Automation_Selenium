package Assignment.Dws_GiftCard_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCard {

	public static void main(String[] args) throws InterruptedException {
		String expectedResult = "https://demowebshop.tricentis.com/";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		String actualresult = driver.getCurrentUrl();
		if(expectedResult.equals(actualresult)) {
			System.out.println("You are in dws page");
            driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/input")).sendKeys("trtbhai@gmail.com");
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[3]/input")).sendKeys("RtBhai@9294");
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/input")).click();
			System.out.println("Login Sucessfully");
			
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[3]/div/div/div[3]/div[2]/div//div[2]/div[3]/div[2]/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div[2]/div/form/div/div/div[2]/div[4]/div[1]/input")).sendKeys("Lavi");
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div[2]/div/form/div/div/div[2]/div[4]/div[2]/input")).sendKeys("lavi@gmail.com");
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div[2]/div/form/div/div/div[2]/div[6]/div/input")).clear();
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div[2]/div/form/div/div/div[2]/div[6]/div/input")).sendKeys("2");
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div[2]/div/form/div/div/div[2]/div[6]/div/input[2]")).click();
			System.out.println("Gift added sucessfully");
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();	
			System.out.println("Logout sucessfully");
			
		}else {
			System.out.println("You are not in dws page");
		}
			
			Thread.sleep(2000);
		


	}
}
