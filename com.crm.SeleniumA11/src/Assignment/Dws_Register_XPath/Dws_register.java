package Assignment.Dws_Register_XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dws_register {

	public static void main(String[] args) throws InterruptedException {
		String expectedUrl="https://demowebshop.tricentis.com/";
		 ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		String actualUrl=driver.getCurrentUrl();
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("You are in dws page");
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div/div[1]/input")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Deepak");
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("Singh");
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("trtbhai@gmail.com");
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div/input")).sendKeys("RtBhai@9294");
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("RtBhai@9294");
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
		    System.out.println("Registration sucessfull");		
		}else {
			System.out.println("You are not in dws page");
		}
		
		Thread.sleep(2000);
		driver.close();

	}

}
