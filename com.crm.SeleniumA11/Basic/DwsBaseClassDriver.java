package Basic;

import org.openqa.selenium.By;

public class DwsBaseClassDriver extends DwsBase1{

	public static void main(String[] args) {
		
	
		preCondition("chrome");
		login();
		DwsBase1.driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		DwsBase1.driver.findElement(By.className("search-box-button")).click();
		logout();
		postCondition();
		postCondition2();
	

	}

}
