package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppsSendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(1000);
		WebElement name=driver.findElement(By.id("name"));
		WebElement email=driver.findElement(By.id("email"));
		name.sendKeys("Sakura");Thread.sleep(1000);
		name.sendKeys(Keys.CONTROL+"a");
		name.sendKeys(Keys.CONTROL+"c");
		email.sendKeys(Keys.CONTROL+"v");
		//driver.findElement(By.xpath("//button[text()='Register']")).submit();
	}

}
