package Session;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	        driver.get("https://www.flipkart.com");
	        driver.manage().window().maximize();

	        try {
	            WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='✕']")));
	            closeBtn.click();
	        } catch (Exception e) {
	            System.out.println("Popup not found");
	        }
	        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
	        searchBox.sendKeys("iphone");
	        searchBox.sendKeys(Keys.ENTER);

	        System.out.println("Search performed");
	       	}

}
