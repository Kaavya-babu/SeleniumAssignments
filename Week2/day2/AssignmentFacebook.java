package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFacebook {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kaavya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Babu");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7550162883");
		driver.findElement(By.xpath("//div//input[@name='reg_passwd__']")).sendKeys("Kaavya@2805");
		
		Select daydrop= new Select (driver.findElement(By.xpath("//select[@name='birthday_day']")));
		daydrop.selectByValue("28");
		Select monthDrop= new Select (driver.findElement(By.xpath("//span//select[@name='birthday_month']")));
		monthDrop.selectByIndex(5);
		Select yearDrop= new Select (driver.findElement(By.xpath("//select[@name='birthday_year']")));
		yearDrop.selectByValue("1997");
		
		driver.findElement(By.xpath("//label[text()= 'Female']")).click();
		
		
		System.out.println("Done");
		driver.close();

	}

}
