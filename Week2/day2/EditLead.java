package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Kaavya");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		System.out.println(driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement companyName=driver.findElement(By.xpath("//td/input[@id='updateLeadForm_companyName']"));
		String companyName1= companyName.getText();
		companyName.clear();
		companyName.sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String changed= driver.findElement(By.xpath("//td/span[@id='viewLead_companyName_sp']")).getText();
		if(companyName1.equalsIgnoreCase(changed)) {
			System.out.println("Name not changed");
		} else
			System.out.println("Name changed");
		driver.close();
	}

}
