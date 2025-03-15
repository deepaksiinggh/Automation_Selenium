package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeX_path {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
//		driver.navigate().to();
//		WebElement register = driver.findElement(By.xpath("//a[@class='ico-login']"));
//		WebElement register2 = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/div[3]/div/strong"));
		String register3= driver.findElement(By.xpath("//strong[text()='Community poll']")).getText();
		System.out.println(register3);
		
		driver.close();
		

	}

}
