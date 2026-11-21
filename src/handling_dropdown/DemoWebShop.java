package handling_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();Thread.sleep(1000);
		Thread.sleep(2000);
		WebElement countryCode=driver.findElement(By.id("country_code"));
		Select s1=new Select(countryCode);Thread.sleep(1000);
		s1.selectByValue("+91");
		
		WebElement country=driver.findElement(By.id("select3"));
		Select s2=new Select(country);Thread.sleep(1000);
		s2.selectByVisibleText("India");
		
		
		WebElement state=driver.findElement(By.id("select5"));
		Select s3=new Select(state);Thread.sleep(2000);
		s3.selectByVisibleText("Karnataka");
		
		WebElement city=driver.findElement(By.xpath("(//select)[5]"));
		Select s4=new Select(city);Thread.sleep(2000);
		s4.selectByIndex(2);
		
		WebElement qty=driver.findElement(By.id("select7"));
		Select s5=new Select(qty);Thread.sleep(2000);
		s5.selectByValue("2");
		
		driver.quit();
		
		
		
		
	}

}
