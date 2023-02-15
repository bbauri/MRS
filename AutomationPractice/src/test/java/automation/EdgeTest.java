package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =  new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.myntra.com/");
		
		driver.quit();
		
	}

}
