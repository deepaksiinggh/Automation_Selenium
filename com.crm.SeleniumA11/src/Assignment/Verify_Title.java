package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	public static void main(String[] args) {
		String expected ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=navm_hdr_logo");
		String actual =driver.getTitle();
		if(expected.equals(actual)) {
			System.out.println("You are in amazon page");
		}else {
			System.out.println("Input mismatch small change");
		}
		
		driver.close();
		
	}

}
