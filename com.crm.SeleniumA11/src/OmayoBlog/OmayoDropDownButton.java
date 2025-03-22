package OmayoBlog;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoDropDownButton {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.className("dropbtn")).click();
//        WebElement clickFaceBook = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));
//        clickFaceBook.click();
        driver.findElement(By.linkText("Facebook")).click();
        driver.navigate().back();
       driver.findElement(By.id("alert2")).click();
       Alert alt = driver.switchTo().alert();
       alt.accept();
       
        
        
  
       
      
    }
}
