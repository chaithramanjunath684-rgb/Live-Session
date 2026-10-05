package Session;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

	        // Wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // Maximize browser
	        driver.manage().window().maximize();

	        // Open webpage
	        driver.get("https://www.selenium.dev/selenium/web/web-form.html");


	        // 1. Find the dropdown
	        WebElement dropdown =driver.findElement(By.name("my-select"));


	        // 2. Create Select object
	        Select select = new Select(dropdown);


	        // 3. selectByVisibleText()
	        select.selectByVisibleText("Two");


	        // 4. Get selected option
	        String selected =select.getFirstSelectedOption().getText();

	        System.out.println("Selected: " + selected);


	        // 5. selectByValue()
	        select.selectByValue("3");

	        System.out.println("Selected: " +select.getFirstSelectedOption().getText());


	        // 6. selectByIndex()
	        select.selectByIndex(1);

	        System.out.println(
	            "Selected: " +select.getFirstSelectedOption().getText());


	        // 7. Get all options
	        List<WebElement> options =select.getOptions();

	        System.out.println("All Options:");

	        for (WebElement option : options) {

	            System.out.println(option.getText());
	        }


	        // 8. Check whether dropdown is multiple
	        boolean multiple =select.isMultiple();

	        System.out.println("Multiple Dropdown: " + multiple);


	        // Close browser
	       
	    }
}
 