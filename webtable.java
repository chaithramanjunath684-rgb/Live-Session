package Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           WebDriver driver = new ChromeDriver();
           driver.get("https://the-internet.herokuapp.com/tables");
          WebElement table=driver.findElement(By.id("table1"));  //find table
     /*     //rows
          List<WebElement> rows=table.findElements(By.cssSelector("tr"));   //find all rows
          //System.out.println("Rows:"+ rows.size());   // count rows how many are their
          //WebElement row2=rows.get(2); //get the value in cells here row 2 olage cell values torsuthe row mathe cell both added together row value chnage madidre cell value change haguthe
          //System.out.println(row0.getText());//it will take all (lastname ,firstname,email,due,wedsite,action)
          System.out.println(rows.get(0).getText()); 
          System.out.println(rows.get(1).getText());
          System.out.println(rows.get(2).getText());
          System.out.println(rows.get(3).getText());
          System.out.println(rows.get(4).getText());
          //System.out.println(rows.get(1).findElements(By.cssSelector("td")).get(0).getText());
          //System.out.println(rows.get(2).findElements(By.cssSelector("td")).get(0).getText());
          //System.out.println(rows.get(3).findElements(By.cssSelector("td")).get(0).getText());
          //System.out.println(rows.get(4).findElements(By.cssSelector("td")).get(0).getText());
         
          
          //cells
          List<WebElement> cells=table.findElements(By.cssSelector("td"));
          System.out.println("cells:"+cells.size());
          //WebElement row=rows.get(2);
          //System.out.println(cell0.getText());//reads only inside value particular name (smith) 
          System.out.println(cells.get(0).getText());
          System.out.println(cells.get(1).getText());
          System.out.println(cells.get(2).getText());
          System.out.println(cells.get(3).getText());
          System.out.println(cells.get(4).getText());
          System.out.println(cells.get(5).getText());
          
          //columns
          List<WebElement> columns=table.findElements(By.cssSelector("th"));
          System.out.println("Columns:"+columns.size());
          //WebElement column0=columns.get(0);
          //System.out.println(column0.getText());//it will take only one column name (lastname)
          System.out.println(columns.get(0).getText());
          System.out.println(columns.get(1).getText());
          System.out.println(columns.get(2).getText());
          System.out.println(columns.get(3).getText());
          System.out.println(columns.get(4).getText());
          System.out.println(columns.get(5).getText());
     */
	}
}