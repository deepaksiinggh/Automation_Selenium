package JavaScriptAlertPopUp;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConformationAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		WebElement links = driver.findElement(By.xpath("//div[@class='col-md-12']/div/div/ul/li/a"));
		
	
		driver.findElement(By.cssSelector(".btn.btn-danger")).click();
		Thread.sleep(2000);
		Alert alt =driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		Thread.sleep(2000);
		Alert alt2 =driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt.accept();
		
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-info")).click();
		Thread.sleep(2000);
		Alert alt3 =driver.switchTo().alert();
		alt3.sendKeys("Deepak");
		System.out.println(alt3.getText());
		alt.accept();
		
	}

}
