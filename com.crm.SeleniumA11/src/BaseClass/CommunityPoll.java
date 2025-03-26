package BaseClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommunityPoll extends DwsBase1 {

	public static void main(String[] args) throws InterruptedException {
		
preCondition("chrome");
Thread.sleep(2000);

	List <WebElement>poll=driver.findElements(By.name("pollanswers-1")); 
	for(WebElement t1:poll) {
		 t1.click();
	}



	}

}
