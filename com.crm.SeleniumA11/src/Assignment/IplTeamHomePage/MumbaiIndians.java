package Assignment.IplTeamHomePage;

import org.openqa.selenium.chrome.ChromeDriver;

public class MumbaiIndians {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mumbaiindians.com/");
		driver.close();
		

	}

}
