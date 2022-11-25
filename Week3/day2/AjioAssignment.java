package Week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioAssignment {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String totalItems= driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(totalItems+ " from applying the filter");
		//all brand list
		List<WebElement> allBrandsList=  driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> allBrandsListed= new ArrayList<String>();
		for (WebElement brandName: allBrandsList) {
			String brand= brandName.getText();
			allBrandsListed.add(brand);
		}
		System.out.println("The List of the Brands in this page is:");
		System.out.println(allBrandsListed);
		
		//all bag name list
		List<WebElement> allBagNamesList=  driver.findElements(By.xpath("//div[@class='nameCls']"));
		//List<String> allBagsListed= new ArrayList<String>();
		System.out.println("The List of the Bags name in this page is:");
		for (WebElement bagName: allBagNamesList) {
			String bag= bagName.getText();
			System.out.println(bag);
			} driver.close();
	} 
}
