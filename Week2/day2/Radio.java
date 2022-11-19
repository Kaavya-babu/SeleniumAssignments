package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/radio.xhtml");
		//Your most favorite browser
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		//UnSelectable
		Actions unSelectable=new Actions(driver);
		WebElement element= driver.findElement(By.xpath("(//label[text()='Chrome'])[1]"));
		unSelectable.moveToElement(element).doubleClick().perform();
		if(element.isSelected()) {
			System.out.println("Element is selected");
		} else System.out.println("Element is not selected");
		//Find the default select radio button
		String defaultValue= driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).getText();
		System.out.println("The default option selectedis: "+ defaultValue);
		//Select the age group (only if not selected)
		WebElement selectedElement= driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[24]"));
		if(selectedElement.isSelected())
		{
			driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[24]")).click();
		}
		System.out.println(driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[24]")).isSelected());
		System.out.println("Radio assignment done");			
driver.close();
	}

}
