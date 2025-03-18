package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBywebElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement vote = driver.findElement(By.id("vote-poll-1"));
		if(vote.isDisplayed()) {
			System.out.println("i am in dws webpage");
		}else {
			System.out.println("I am not in dws webpage");
		}
		Thread.sleep(2000);
		driver.close();

	}

}
