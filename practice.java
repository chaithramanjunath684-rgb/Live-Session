package Session;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver =new ChromeDriver();
        
         //driver.get("https://the-internet.herokuapp.com/dropdown"); this is for dropdown
         //driver.get("https://the-internet.herokuapp.com/javascript_alerts");//this is for alerts
         driver.get( "https://www.tutorialspoint.com/selenium/practice/frames.php");  //this for frames
         driver.getCurrentUrl();
         System.out.println(driver.getCurrentUrl());
        // driver.navigate().refresh();  
         
         /*driver.findElement(By.id("username"));
         driver.findElement(By.name("user"));
         driver.findElements(By.className("textbox"));
         driver.findElement(By.tagName("input"));
         driver.findElement(By.linkText("login"));
         driver.findElements(By.partialLinkText("log"));
         driver.findElements(By.cssSelector("#username"));
         driver.findElement(By.xpath("//input[@id='username']"));
         */
         /*WebElement element=driver.findElement(By.id("email"));
         element.sendKeys("chaithra");
         element.clear();
         element.sendKeys("thra");
         WebElement password=driver.findElement(By.id("pass"));
         password.sendKeys("12345");
         WebElement button=driver.findElement(By.id("login"));
         button.click();*/
        
         /*WebElement dropdown=driver.findElement(By.id("dropdown")); 
		 Select select=new Select(dropdown);
         select.selectByVisibleText("Option 1");
         System.out.println(select.getFirstSelectedOption().getText());
         select.selectByVisibleText("Option 2");
         select.deselectAll();*/
                                 //copy xpath in website by inspect 
         /*driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button")).click();
         Alert alert=driver.switchTo().alert();
         //alert.accept();
         alert.dismiss();*/
         
        driver.switchTo().frame(0);
        
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        
        
         
         
         
         
         
         
         
         
         
         
	}
}
