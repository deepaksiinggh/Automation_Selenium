package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Rcb {

	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		//minimize the browser
		driver.manage().window().maximize();
		//open the website
		driver.get("https://www.royalchallengers.com/");
		//close the webPae
		driver.close();
		

	}

}
