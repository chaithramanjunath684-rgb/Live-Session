package Session;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HElements {  //this is of handling webelements

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

	        // Open website
	        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

	        // 1. Textbox
	        WebElement textbox = driver.findElement(By.name("my-text"));
	        textbox.sendKeys("Hello Selenium");

	        // 2. Checkbox
	        WebElement checkbox = driver.findElement(By.id("my-check-2"));
	        checkbox.click();

	        System.out.println("Checkbox: " + checkbox.isSelected());

	        // 3. Radio button
	        WebElement radio = driver.findElement(By.id("my-radio-2"));
	        radio.click();

	        System.out.println("Radio: " + radio.isSelected());
         
	     // 4. Dropdown
	        WebElement dropdown = driver.findElement(By.name("my-select"));
	        Select select = new Select(dropdown);
	        select.selectByVisibleText("Two");

	        System.out.println("Dropdown: "
	                + select.getFirstSelectedOption().getText());

	        // 5. Heading
	        WebElement heading = driver.findElement(By.tagName("h1"));
	        System.out.println("Heading: " + heading.getText());

	       
	        // 6. Image
	        WebElement image = driver.findElement(By.tagName("img"));
	        System.out.println("Image displayed: "
	                + image.isDisplayed());
	        //except this one all are excute 

	        // 7. Link
	        WebElement link = driver.findElement(By.linkText("Return to index"));
	        System.out.println("Link displayed: "
	                + link.isDisplayed());

	        driver.quit();
	        
	        //system.out.println is used to check whether it is ture or false in program running not in web browers.
	}
}
