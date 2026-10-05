package Session;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");


        // 1. sendKeys()
        WebElement textBox =driver.findElement(By.name("my-text"));

        textBox.sendKeys("Hello Selenium");


        // 2. clear()
        textBox.clear();

        textBox.sendKeys("Selenium");


        // 3. getAttribute()
        String attribute =textBox.getAttribute("name");

        System.out.println("Attribute: " + attribute);


        // 4. isDisplayed()
        boolean displayed =textBox.isDisplayed();

        System.out.println("Displayed: " + displayed);


        // 5. isEnabled()
        boolean enabled =textBox.isEnabled();

        System.out.println("Enabled: " + enabled);


        // 6. getTagName()
        String tagName =textBox.getTagName();
        System.out.println("Tag Name: " + tagName);

        // 7. Checkbox - click()
        WebElement checkbox =driver.findElement(By.id("my-check-2"));

        checkbox.click();


        // 8. isSelected()
        boolean selected =checkbox.isSelected();

        System.out.println("Checkbox Selected: " + selected);


        // 9. Radio button - click()
        WebElement radio =driver.findElement(By.id("my-radio-2"));

        radio.click();

        System.out.println(
                "Radio Selected: " + radio.isSelected());


        // 10. Dropdown
        WebElement dropdown =driver.findElement(By.name("my-select"));

        Select select = new Select(dropdown);

        select.selectByVisibleText("Two");


        // 11. getText()
        String selectedText =select.getFirstSelectedOption().getText();

        System.out.println(
                "Selected Option: " + selectedText);


        // 12. Button - click()
        WebElement button =driver.findElement(By.cssSelector("button"));

        button.click();


        driver.quit();
    }
}
