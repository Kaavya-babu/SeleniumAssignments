package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/input.xhtml;jsessionid=node01j540a7o52can13p945ps0fry4418339.node0");
		driver.findElement(By.xpath("//div[@class='col-12']/input[@name='j_idt88:name']")).sendKeys("Kaavya babu");
		driver.findElement(By.xpath("//div[@class='col-12']/input[@name='j_idt88:j_idt91']")).sendKeys("Chennai");
		System.out.println(driver.findElement(By.xpath("//input[@placeholder='Disabled']")).isEnabled());
	driver.close();
	}

}
