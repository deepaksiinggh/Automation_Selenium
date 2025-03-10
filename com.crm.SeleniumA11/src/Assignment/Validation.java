package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) throws InterruptedException {
		String expectedUrl="https://www.chennaisuperkings.com/";
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	Thread.sleep(2000);
		
		
		driver.get("https://www.chennaisuperkings.com/");
		String actualUrl= driver.getCurrentUrl();
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println(" i am in csk page");
			System.out.println("Ready for action");
		}else {
			System.out.println("I am not csk page");
		}
		
		Thread.sleep(2000);
		driver.close();

	}

}
