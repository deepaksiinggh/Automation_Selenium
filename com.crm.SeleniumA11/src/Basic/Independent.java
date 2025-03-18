package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Independent {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		String str=driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span")).getText();
		String str2=driver.findElement(By.xpath("//a[text()='Music 2']/../../div[3]/div/span")).getText();
		String str3=driver.findElement(By.xpath("//div[@title='291 review(s)']/../div[3]/div/span")).getText();
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
		Thread.sleep(2000);
		driver.close();

	}

}
