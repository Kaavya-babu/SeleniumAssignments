package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround2 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled());
		int position1= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation().getX();
		int position2= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation().getX();
		System.out.println(position1 + " "+ position2);
		 String color= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("color");
		String hex = Color.fromString(color).asHex();
		System.out.println(hex);

	}

}
