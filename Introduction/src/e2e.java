import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/arunganuga/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();// selecting calender
        
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) // checking if the arrival other calnder is disabled because this is foroneway trip
        {
        	System.out.println("is disabled");
        	Assert.assertTrue(true);
        	
        }
        else
        {
        	Assert.assertTrue(false);
        }
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();// checkbox
        
        driver.findElement(By.id("divpaxinfo")).click(); // clicking on passenger dropdown
        
        Thread.sleep(2000L);
        

        for(int i=1;i<5;i++) // selecting passengers
        {
        	 driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        
      //driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
      driver.findElement(By.cssSelector("input[value='Search']")).click();
	}
	
	

}
