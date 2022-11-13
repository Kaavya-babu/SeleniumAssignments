package Week1.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");

	}

}
