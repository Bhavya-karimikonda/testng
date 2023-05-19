import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngMain{

		WebDriver driver = null;
	
		@BeforeMethod
		public void setUpTest() {
			driver = new ChromeDriver();
			
			ChromeOptions options = new ChromeOptions();
			
			options.addArguments("start-maximized");
		    
			driver = new ChromeDriver(options);
			
		}
		
		@Test
		public void gotoPage() {
			  driver.get("https://www.bstackdemo.com");
		      AssertJUnit.assertTrue(driver.getTitle().matches("StackDemo"));
		}
	
		@Test
		public void gotoPage() {
			  driver.get("https://www.bstackdemo.com");
		      AssertJUnit.assertTrue(driver.getTitle().matches("BStackDemo1")); //to fail
		}
		
		@Test
		public void addToCart() {
			 driver.get("https://www.bstackdemo.com");
			 driver.findElement(By.xpath("//*[@id=\"1\"]/div[4]")).click(); 
			 AssertJUnit.assertTrue(driver.findElement(By.cssSelector(".float\\-cart__content")).isDisplayed());
			 
		}
		
	
		
		@AfterMethod
		public void cleanUp() {
			driver.quit();
		}
		
	
}
