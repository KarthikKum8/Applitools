package Appitoolsproject.Test1;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.applitools.*;
import com.applitools.eyes.*;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.SeleniumEyes.WebDriverAction;
import com.applitools.utils.*;
import org.openqa.selenium.firefox.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     // Initialize the Runner for your test.
        EyesRunner runner = new ClassicRunner();
        // Initialize the eyes SDK
        Eyes eyes = new Eyes(runner);
        // Change the APPLITOOLS_API_KEY API key with yours
        eyes.setApiKey("PWx2ZFkIzAh7Eb111wfSsxLzVzyk4IzQlDjYkLCEehRNI110");
        
	    WebDriver driver=new FirefoxDriver();
	    //driver.get("https://demo.applitools.com/hackathon.html");
	    driver.get("https://demo.applitools.com/hackathonV2.html");
	    eyes.open(driver, "Demo App", "Smoke Test", new RectangleSize(800, 600));
        // Navigate the browser to the "ACME" demo app.
        //Check the login
        
        
		eyes.checkWindow("Login Window");
		eyes.checkElement(By.id("username"));
		eyes.checkElement(By.id("password"));
		eyes.checkElement(By.id("log-in"));
		driver.findElement(By.id("username")).sendKeys("un");
		driver.findElement(By.id("password")).sendKeys("pass");
		driver.findElement(By.id(("log-in"))).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		eyes.checkWindow("Homepage");
		WebElement status=driver.findElement(By.xpath("//table[@id='transactionsTable']/thead/tr/th"));
		status.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eyes.checkWindow("TableSort");
		WebElement compareexpense=driver.findElement(By.id(("showExpensesChart")));
		  compareexpense.click();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eyes.checkWindow("CompareExpenses");
        // End the test.
        eyes.close();
        
        // Close the browser.
        driver.quit();

    }
}
