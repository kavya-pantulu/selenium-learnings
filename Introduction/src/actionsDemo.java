import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO
		

		System.setProperty("webdriver.chrome.driver","/Users/arunganuga/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Actions a= new Actions(driver);
        WebElement move= driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"));
        a.moveToElement(move).contextClick().build().perform();
	    a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	}
}
