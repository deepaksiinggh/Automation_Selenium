package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		// open the brower
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().minimize();
		
		driver.get("https://www.geeksforgeeks.org/");
		
		driver.close();
		
		

	}

}
