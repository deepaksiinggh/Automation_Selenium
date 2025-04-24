package screenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipcart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
     
        WebElement logo = driver.findElement(By.cssSelector("img[title='Flipkart']"));

        
        File sourceFile = logo.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir") + "\\Screenshot\\flipkart_logo.png");

       
        sourceFile.renameTo(targetFile);

        driver.close();
    }
}

