package Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesuggestion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com");
       
       driver.findElement(By.name("q")).sendKeys("selenium");
       Thread.sleep(2000);
       List<WebElement> options = driver.findElements(By.xpath("//div[@role='option']"));
      
       
       
       for(WebElement option : options) {
    	   System.out.println(option.getText());
		   if(option.getText().equalsIgnoreCase("selenium interview questions")) {
			   option.click();
			   break;
		   }
	   }
	}

}
