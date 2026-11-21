package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAppsDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		
		Actions a=new Actions(driver);
		 WebElement mobileArea = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	        WebElement laptopArea = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	        WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	        WebElement mobileCover   = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
	        WebElement laptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	        WebElement laptopCover   = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));

	        a.dragAndDrop(mobileCharger, mobileArea).perform();
	        a.dragAndDrop(mobileCover, mobileArea).perform();

	        a.dragAndDrop(laptopCharger, laptopArea).perform();
	        a.dragAndDrop(laptopCover, laptopArea).perform();

		
		
	}

}
