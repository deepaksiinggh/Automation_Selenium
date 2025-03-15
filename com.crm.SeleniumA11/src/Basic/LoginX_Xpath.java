package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginX_Xpath {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
    Thread.sleep(2000);
    driver.close();
}
}
