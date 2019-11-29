package Appli_Tradional.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import static org.testng.Assert.assertTrue;

import java.sql.Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
public class NewTest {
	WebDriver driver=new FirefoxDriver();
@BeforeTest
  public void beforeTest() {
	
	driver.get("https://demo.applitools.com/hackathon.html");
	
	  }
  @Test
  public void Login() {
	  
	assertTrue(driver.findElement(By.id(("username"))).isDisplayed(), "Username is displayed");
	assertTrue(driver.findElement(By.id(("password"))).isDisplayed(), "Password is displayed");
	assertTrue(driver.findElement(By.id(("log-in"))).isDisplayed(), "Password is displayed");
	driver.findElement(By.id("username")).sendKeys("un");
	driver.findElement(By.id("password")).sendKeys("pass");
	driver.findElement(By.id(("log-in"))).click();
	}
  
  @Test
  
  public void clickTablestatus() {
	  WebElement status=driver.findElement(By.xpath("//table[@id='transactionsTable']/thead/tr/th"));
	 assertTrue(status.isDisplayed(),"status link is displayed");
	  status.click();
  }
  @Test
  public void clickcompareExpense() {
	  WebElement compareexpense=driver.findElement(By.id(("showExpensesChart")));
	  assertTrue(compareexpense.isDisplayed(),"compareexpense is displayed");
	  compareexpense.click();
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
