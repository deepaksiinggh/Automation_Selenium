package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByTitle {

	public static void main(String[] args) {
		String expectedTitle="Chennai Super Kings";
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.chennaisuperkings.com/");
		String actualTitle=driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("I am in chennai page");
		}else {
			System.out.println("I am not chennai page");
		}
		
		driver.close();

	}

}
