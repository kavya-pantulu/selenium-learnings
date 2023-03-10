import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver","/Users/arunganuga/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password= getpassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
       System.out.println( driver.findElement(By.tagName("p")).getText());
       Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
      Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
      driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		// TODO Auto-generated method stub
      driver.close();

	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		 String passwordText= driver.findElement(By.cssSelector("form p")).getText();
		 String[] passwordArray= passwordText.split("'");
		 //String[] passwordArray2= passwordArray[1].split("'");
		// passwordArray2[0];
		 String password= passwordArray[1].split("'")[0];
		 return password;
	}
		 
	}


