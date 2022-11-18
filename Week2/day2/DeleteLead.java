package Week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//span[text()='Phone']/parent:: span")).click();
		driver.findElement(By.xpath("//div/input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		System.out.println(driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText());
		String captured= driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//div/input[@name='id']")).sendKeys(captured);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String deletion= driver.findElement(By.xpath("//div[contains(text(),'No')]")).getText();
		String deletedMsg= "No records to display";
		if(deletion.equalsIgnoreCase(deletedMsg))
		{
			System.out.println("Lead Deleted successfully");
		} else System.out.println("Not deleted");
		
		

	System.out.println("Done ");
	driver.close();
	}

}
