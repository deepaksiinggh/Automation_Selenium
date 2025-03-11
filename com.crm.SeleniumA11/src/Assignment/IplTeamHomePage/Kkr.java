package Assignment.IplTeamHomePage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Kkr {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kkr.in/");
		driver.close();

	}

}
