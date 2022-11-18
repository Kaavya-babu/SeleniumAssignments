package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("kavi");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		System.out.println(driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		System.out.println(driver.findElement(By.xpath("//td/span[@id='viewLead_firstName_sp']")).getText());
		String firstCaptured= driver.findElement(By.xpath("//td/span[@id='viewLead_firstName_sp']")).getText();
		
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate')]")).click();
		System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    
	    System.out.println(driver.findElement(By.xpath("//td/span[@id='viewLead_firstName_sp']")).getText());
	    String secondCaptured= driver.findElement(By.xpath("//td/span[@id='viewLead_firstName_sp']")).getText();
	    if(firstCaptured.equalsIgnoreCase(secondCaptured))
	    {
	    	System.out.println("Both are same");
	    } else 
	    	System.out.println("Not same ");
	    
	
driver.close();
}
}
