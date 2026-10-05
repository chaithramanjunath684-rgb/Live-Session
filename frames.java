package Session;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Open Chrome
        WebDriver driver = new ChromeDriver();

        // 2. Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 3. Maximize
        driver.manage().window().maximize();

        // 4. Open iframe page
        driver.get("https://www.selenium.dev/selenium/web/iframes.html");

        // 5. Switch using INDEX
   
        driver.switchTo().frame(0);

        System.out.println("Inside Frame using index");
        // 6. Come back to parent frame
       
        driver.switchTo().parentFrame();

        System.out.println("Back to parent frame");

        // 7. Switch using WebElement
        
        WebElement frame =
                driver.findElement(By.tagName("iframe"));

        driver.switchTo().frame(frame);

        System.out.println("Inside Frame using WebElement");

        // 8. Come completely back
       
        driver.switchTo().defaultContent();

        System.out.println("Back to Main Page");
        // 9. Close browser
        

    
	}

}
