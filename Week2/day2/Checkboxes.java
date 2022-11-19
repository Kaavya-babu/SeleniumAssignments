package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://leafground.com/checkbox.xhtml");
		//Basic Checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Notification
		String t="Checked";
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		List<WebElement> l= driver.findElements(By.xpath("//*[contains(text(),'Checked')]"));
	      // verify list size
	      if ( l.size() > 0){
	         System.out.println("Notification: " + t + " is present. ");
	      } else {
	         System.out.println("Notification: " + t + " is not present. ");
	      }
	      //Choose your favorite language(s)
	      driver.findElement(By.xpath("//label[text()='Java']")).click();
	      driver.findElement(By.xpath("//label[text()='Python']")).click();
	      //Tri State Checkbox
	      Actions act= new Actions(driver);
	     WebElement tri= driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']//following::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
	     act.doubleClick(tri);
	     //Toggle Switch
	     driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
	     //Verify if check box is disabled
	     boolean enabled= driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled();
	     if(enabled) {
	    	 System.out.println("Button is enabled");
	     }else System.out.println("Button is disabled");
	     //Select Multiple
	     driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
	     driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
	     driver.findElement(By.xpath("(//label[text()='Istanbul'])[2]")).click();
	     
	     
System.out.println("Checkbox assignment done");	     
driver.close();
}
}

