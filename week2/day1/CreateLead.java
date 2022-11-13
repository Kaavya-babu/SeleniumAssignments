package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	        
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf.org");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kaavya");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Babu");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kaavya babu");
			driver.findElement(By.name("departmentName")).sendKeys("QA");
			driver.findElement(By.name("description")).sendKeys("Week2day1 assignments completed");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kaavyanermala51997.kn@gmail.com");
			
			Thread.sleep(2000);
			WebElement dropd= driver.findElement(By.name("generalStateProvinceGeoId"));
			Select dropdown= new Select(dropd)  ;
			dropdown.selectByVisibleText("New York");
			
			driver.findElement(By.name("submitButton")).click();
			String titleOfthePage= driver.getTitle();
			System.out.println("The title is:: "+titleOfthePage);
			
			
			
			
			
			
			
			
	}

}
