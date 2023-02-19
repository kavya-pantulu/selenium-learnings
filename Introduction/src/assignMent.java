import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignMent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/arunganuga/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        
        driver.findElement((By.cssSelector("input[id='checkBoxOption1']"))).click();
        System.out.println(driver.findElement((By.cssSelector("input[id='checkBoxOption1']"))).getText());
        
        
	}

}
