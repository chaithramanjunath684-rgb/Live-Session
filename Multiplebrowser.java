package Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectpath=System.getProperty("user.dir");
		System.out.println("projectPath:" + projectpath);
		System.setProperty("webdriver.gecko.driver", projectpath+"/Drivers/Firefoxdriver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://developer.microsoft.com/en-in/microsoft-edge/tools/webdriver");
		
		//System.setProperty("webdriver.gecko.driver", projectpath+"/Drivers/Edgedriver/msedgedriver.exe");
		//WebDriver driver= new EdgeDriver();
		//driver.get("https://github.com/mozilla/geckodriver/releases");
		
		
	}

}
