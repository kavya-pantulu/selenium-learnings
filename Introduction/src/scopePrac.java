import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scopePrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/arunganuga/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.tagName("a")).size());  // gives all links count in the web page
        WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        WebElement coloumndriver= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(coloumndriver.findElements(By.tagName("a")).size());
        
        for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
        	{
        	  String clickonlinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
        	  
        	  coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
        	  
        	
        	}
	}

}
