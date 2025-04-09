package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
        driver.findElement(By.xpath("//div[@class='form-group']/div/input")).sendKeys("Deepak");
        driver.findElement(By.xpath("//div[@class='form-group']/div[2]/input")).sendKeys("Singh");
        act.sendKeys(Keys.TAB).sendKeys("hello panni how are you")
        .sendKeys(Keys.TAB).sendKeys("deepak@9294")
        .sendKeys(Keys.TAB).sendKeys("9294845246").perform();
        

	
        
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        
        Thread.sleep(2000); 
        act.keyDown(Keys.PAGE_DOWN).perform();
		
        Thread.sleep(1000);

		WebElement cricketCheckbox = driver.findElement(By.id("checkbox1"));
		 cricketCheckbox.click();
		 
		 
    	driver.findElement(By.id("msdd")).click();
		List<WebElement> el = driver.findElements(By.xpath("//form[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li/a"));
		el.get(3).click();
		Thread.sleep(2000); 
		
		
		
		 Thread.sleep(2000); 
      Select getSkills = new Select(driver.findElement(By.id("Skills")));
		getSkills.selectByValue("Adobe InDesign");
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		Thread.sleep(1000); 

		List<WebElement> countryOptions = driver.findElements(By.xpath("//ul[@id='select2-country-results']/li"));
		if (countryOptions.size() > 2) {
          countryOptions.get(2).click(); 
      }
		
		
		Select year = new Select(driver.findElement(By.id("yearbox")));
		year.selectByValue("2000");
		
		Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		month.selectByValue("June");
		
		Select day = new Select(driver.findElement(By.id("daybox")));
		day.selectByValue("24");
		act.sendKeys(Keys.TAB).sendKeys("Deepak@9294").perform();
		act.sendKeys(Keys.TAB).sendKeys("Deepak@9294").perform();
		WebElement submitbtn=driver.findElement(By.id("submitbtn"));
		submitbtn.click();

      
      
		}
       
	

}
