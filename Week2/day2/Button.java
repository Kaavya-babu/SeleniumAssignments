package week2.day2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		//Click and Confirm title.
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		//Confirm if the button is disabled.
		System.out.println(driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled());
		//Find the position of the Submit button
		int position1= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation().getX();
		int position2= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation().getX();
		System.out.println(position1 + " "+ position2);
		//Find the Save button color
		String color= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("color");
		System.out.println(color);
		//Find the height and width of this button
        WebElement button=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
        Dimension dim=button.getSize();
        System.out.println(dim);
        //Mouse over and confirm the color changed
        WebElement hoverElement=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
        String colorBefore= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']")).getCssValue("color");
        Actions a = new Actions(driver);
        a.moveToElement(hoverElement).perform();
        String colorAfter= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']")).getCssValue("color");
        if(colorBefore.equalsIgnoreCase(colorAfter))
        {
        	System.out.println("Button Color not changed");
        } else System.out.println("Button Color changed"+ colorAfter);
        //Click Image Button and Click on any hidden button
        driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='j_idt88:j_idt110']")).click();        
        List<WebElement> Buttons = driver.findElements(By.tagName("button"));
            System.out.println(Buttons.size());
        

        
		
		
	driver.close();	
	}

}
