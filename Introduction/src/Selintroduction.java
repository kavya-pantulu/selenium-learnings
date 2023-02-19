import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "/Users/arunganuga/Downloads/chromedriver");
	
	//WebDriver driver = new ChromeDriver();	
	
	// Open facebook
	
	 
	// Maximize browser
	//driver.manage().window().maximize();
	
		 
	 WebDriver driver = new ChromeDriver();
	
	
	 driver.get("http://www.facebook.com");
	 
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
		
	}

}
