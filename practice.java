package Session;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String google = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.dev");
		String selenium = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		String facebook = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);

		driver.switchTo().window(facebook);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div[2]/form/div/div[1]/div/div[1]/div/div/div[1]/input")).sendKeys("Chaithra");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div[2]/form/div/div[1]/div/div[2]/div/div/div[1]/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div[2]/form/div/div[1]/div/div[3]/div/div/div")).click();

		driver.switchTo().window(google);
		WebElement box =driver.findElement(By.name("q"));
		box.sendKeys("instagram");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li//div[@class='wM6W7d']")));
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("instagram")) {
				option.click();
				break;
			}
		}
		
		
		
	}
}