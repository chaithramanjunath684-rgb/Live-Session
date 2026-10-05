package Session;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousekeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         Actions actions =new Actions(driver);
         //click
         /*driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
         WebElement element =driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
         actions.click(element).perform();
         actions.clickAndHold(element).perform(); //click and hold
         actions.release().perform();  //release 
         actions.doubleClick(element).perform();*/
         //mouse hover
         /*driver.get("https://the-internet.herokuapp.com/hovers");
         WebElement element=driver.findElement(By.cssSelector(".figure"));
         actions.moveToElement(element).perform();*/
         //drag and drop
         /*driver.get("https://the-internet.herokuapp.com/drag_and_drop");
         WebElement element1=driver.findElement(By.id("column-a"));
         WebElement element2=driver.findElement(By.id("column-b"));
         actions.dragAndDrop(element1, element2).perform();*/
         
         //keyboard
         driver.get("https://the-internet.herokuapp.com/login");
         WebElement username=driver.findElement(By.id("username"));
         actions.click(username).perform();
         actions.sendKeys("chaithra").perform();
         actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
         actions.sendKeys("manoj").perform();
         actions.sendKeys(Keys.TAB).perform();
         actions.sendKeys("password").perform();
         actions.sendKeys(Keys.ENTER).perform();
         }
}

