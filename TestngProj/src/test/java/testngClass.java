import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testngClass {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		String projectPath = System.getProperty("user.dir");
		
		System.out.println(projectPath);
		
	//	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("start-maximized");
	    
		driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com");
		
		driver.quit();
		
	}
}
