package Authentication_PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auth_PopUp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_D);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_M);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_D);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_M);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_N);
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
        r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
