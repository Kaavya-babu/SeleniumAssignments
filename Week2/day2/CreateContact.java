package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		    WebDriverManager.chromedriver().setup();
	        
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
			driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
			driver.findElement(By.id("firstNameField")).sendKeys("Kaavya");
			driver.findElement(By.id("lastNameField")).sendKeys("babu");
			driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kaavee");
			driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Dharshu");
			driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("QA");
			driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Testleaf automationn testing program");
			driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("kaavyanirmala1608@gmail.com");
			Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']")));
			stateDropdown.selectByVisibleText("New York");
			driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
			driver.findElement(By.name("importantNote")).sendKeys("testing");
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			System.out.println(driver.getTitle());
			
			
			
			
			
			
			

	driver.close();
	
	}

}
