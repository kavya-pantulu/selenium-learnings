import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/arunganuga/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
        
        driver.findElement(By.xpath("//tr/th[1])")).click();
        List<WebElement> elementsList= driver.findElements(By.xpath("//tr/th[1]"));
        
        List<String> originallist=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
        
        List<String> sortedList=originallist.stream().sorted().collect(Collectors.toList());
        
        Assert.assertTrue(originallist.equals(sortedList));
	}

}
