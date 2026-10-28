package Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriver driver = new ChromeDriver();
          try {
			  driver.get("https://www.saucedemo.com/");
		      driver.findElement(By.id("user-name")).sendKeys("standard_user");
			  driver.findElement(By.id("password")).sendKeys("secret_sauce");
			  driver.findElement(By.id("login-button")).click();
			 if (driver.getTitle().equals("Swag Labs")) {
				 System.out.println("Login test passed");
			 } else {
				 System.out.println("Login test failed");
			 }
		  
             if(driver.findElement(By.id("react-burger-menu-btn")).isDisplayed()) {
				 System.out.println("Menu button is displayed");
			 } else {
				 System.out.println("Menu button is not displayed");
			 }
          } catch (Exception e) {
			  System.out.println("Test failed: " + e.getMessage());
          
          } 
          
	}

}
