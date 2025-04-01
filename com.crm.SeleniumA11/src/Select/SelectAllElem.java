package Select;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllElem {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/tdeep/Downloads/demo%20(1).html");
		WebElement single = driver.findElement(By.id("standard_cars"));
		Select sel = new Select(single);
//		List<WebElement> cars = sel.getOptions();
//		int i=0;
//		for(WebElement web:cars) {
//			sel.selectByIndex(i++);
//			Thread.sleep(1000);
//		}

		sel.selectByIndex(2);
		if(sel.isMultiple()) {
			sel.deselectByIndex(2);
			
		}else{
			System.out.println("It is single select dropDown menu");
		}

	}

}
