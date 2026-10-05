package Session;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.manage().window().maximize();

	        driver.get("https://www.selenium.dev/selenium/web/alerts.html");


	        // 1. Simple Alert
	        driver.findElement(By.id("alert")).click();

	        Alert alert = driver.switchTo().alert();

	        // Get alert message
	        System.out.println("Alert Message: " + alert.getText());

	        // Click OK
	        alert.accept();


	        // 2. Confirmation Alert
	        driver.findElement(By.id("confirm")).click();

	        alert = driver.switchTo().alert();

	        System.out.println("Confirm Message: " + alert.getText());

	        // Click Cancel
	        alert.dismiss();


	        // 3. Prompt Alert
	        driver.findElement(By.id("prompt")).click();

	        alert = driver.switchTo().alert();

	        System.out.println("Prompt Message: " + alert.getText());

	        // Enter text
	        alert.sendKeys("Hello Selenium");

	        // Click OK
	        alert.accept();


	        // Close browser
	        
	    
	
	}

}
