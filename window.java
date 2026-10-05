package Session;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /* WebDriver driver=new ChromeDriver(); //for getWindowHandle
       driver.get("https://www.google.com");
       String tab1 = driver.getWindowHandle();
       driver.switchTo().newWindow(WindowType.TAB);
       driver.get("https://www.selenium.dev");
       String tab2=driver.getWindowHandle();
       driver.switchTo().newWindow(WindowType.TAB);
       driver.get("https://www.facebook.com");
       String tab3=driver.getWindowHandle();
       
       //driver.switchTo().window(tab1);
      // driver.switchTo().window(tab2);
       driver.switchTo().window(tab3);
       
       WebElement username =driver.findElement(By.xpath("//*[@id=\"_R_c9l6neappb6amH1_\"]"));
       username.sendKeys("chaithra");
       */
		WebDriver driver=new ChromeDriver(); //for getWindowHandles
		driver.get("https://www.google.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com");
		
		Set<String> windows=driver.getWindowHandles();
		
		
	}

}
