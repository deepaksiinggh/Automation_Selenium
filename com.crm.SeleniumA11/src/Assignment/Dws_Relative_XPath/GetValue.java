package Assignment.Dws_Relative_XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetValue {

	public static void main(String[] args) throws InterruptedException {
		String expectedUrl= "https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String actualUrl = driver.getCurrentUrl();
		if(expectedUrl.equals(actualUrl)) {
			
			System.out.println("You are in dws website");
			driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
			String radioVal1 = driver.findElement(By.xpath("//label[@for='pollanswers-1']")).getText();
			System.out.println(radioVal1);
            driver.findElement(By.xpath("//input[@id='pollanswers-2']")).click();
            String radioVal2=driver.findElement(By.xpath("//label[@for='pollanswers-2']")).getText();
            System.out.println(radioVal2);
            driver.findElement(By.xpath("//input[@id='pollanswers-3']")).click();
            String radioVal3= driver.findElement(By.xpath("//label[@for='pollanswers-3']")).getText();
            System.out.println(radioVal3);
            driver.findElement(By.xpath("//input[@id='pollanswers-4']")).click();
            String radioVal4=driver.findElement(By.xpath("//label[@for='pollanswers-4']")).getText();
            System.out.println(radioVal4);
		}else {
			System.out.println("You are not in dws website");
		}
		Thread.sleep(2000);
		driver.close();

	}

}
