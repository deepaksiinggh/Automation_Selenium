package Assignment.DwsRegisterCssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		String expectedResult = "https://demowebshop.tricentis.com/";
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.get("https://demowebshop.tricentis.com/");
	String actualresult = driver.getCurrentUrl();
	if(expectedResult.equals(actualresult)) {
		System.out.println("You are in dws page");
		driver.findElement(By.cssSelector(".ico-register")).click();
		driver.findElement(By.cssSelector("#gender-male")).click();
	    driver.findElement(By.cssSelector("#FirstName")).sendKeys("Ravi");
	    driver.findElement(By.cssSelector("#LastName")).sendKeys("Ravi");
	    driver.findElement(By.cssSelector("#Email")).sendKeys("ritesh5898@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("Ritesh@1234");
		driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("Ritesh@1234");
		driver.findElement(By.cssSelector("#register-button")).click();
		
		System.out.println("Registration sucessfully completed");
		
		
	}else {
		System.out.println("You are not in dws page");
	}
		
		Thread.sleep(4000);
		driver.close();

	}

}
