package Assignment.Action_Class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {


		public static void main(String[] args) throws Exception  {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html#google_vignette");
			Actions act=new Actions(driver);
		
			List<WebElement> len = driver.findElements(By.xpath("//div[@id='dropContent']/div"));
			for(int i=1;i<=len.size();i++) {
				act.dragAndDrop(driver.findElement(By.id("box"+i)),driver.findElement(By.id("box10"+i))).perform();
			}

		}
	}


