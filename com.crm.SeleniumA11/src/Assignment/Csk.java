package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Csk {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chennaisuperkings.com/");
		driver.close();
	}

}
