package Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session {


	public static void main(String[] args) throws Exception{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.google.com/");
		//this is for text box
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium");
		searchBox.clear();
		Thread.sleep(5000);
		String typed=searchBox.getAttribute("value");
		driver.findElement(By.name("btnK")).click();
		
		
	}
}
