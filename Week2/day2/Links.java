package week2.day2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws MalformedURLException, IOException {
        WebDriverManager.chromedriver().setup();
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://leafground.com/link.xhtml");
		//Take me to dashboard
		driver.findElement(By.xpath("(//a[contains(text(),'Go to')])[1]")).click();
		driver.navigate().back();
		//Find my destination
		String link= driver.findElement(By.xpath("//a[contains(text(),'Find the URL')]")).getAttribute("href");
		System.out.println(link);
		//Am I broken link?
		String Brokenlink= driver.findElement(By.xpath("//a[text()='Broken?']")).getAttribute("href");
		HttpsURLConnection connection =(HttpsURLConnection) new URL(Brokenlink).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int responseCode= connection.getResponseCode();
		System.out.println(responseCode);
		if(responseCode>400)
		{
			System.out.println("The link is broken");
		} else System.out.println("The link is not broken");
		//count links
		List<WebElement>linkCounts= driver.findElements(By.tagName("a"));
		System.out.println(linkCounts.size());
		//count links in the layout
		WebElement layoutDriver= driver.findElement(By.xpath("(//div[@class='col-12'])[6]"));
		List<WebElement>layoutCounts= layoutDriver.findElements(By.tagName("a"));
		System.out.println(layoutCounts.size());
		
		
		
		
		
		
		
		
		driver.close();
	}

}
