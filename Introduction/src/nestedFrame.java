import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/arunganuga/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.cssSelector("a[href= '/nested_frames']")).click();
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
	    driver.switchTo().frame(0).frame(driver.findElement(By.name("frame-middle")));
		//System.out.println(driver.switchTo().frame(driver.findElement(By.name("frame-middle"))).getTitle());
	}

}
