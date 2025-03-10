package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Rajasthan {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rajasthanroyals.com/");
	driver.close();
}
}
