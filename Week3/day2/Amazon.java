package Week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phone", Keys.ENTER);
		List<WebElement> allPriceList= driver.findElements(By.className("a-price-whole"));
		List<Integer> priceList= new ArrayList<Integer>();
		
		for (WebElement eachPrice : allPriceList)
		{
			System.out.println(eachPrice.getText());
			String text= eachPrice.getText().replace(",", "").replace("₹", "");
			int price= Integer.parseInt(text);
			priceList.add(price);
		}
		Collections.sort(priceList);
		System.out.println("Least price is: "+ priceList.get(0));
		
		
driver.close();
	}

}
