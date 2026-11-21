package handling_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Hidden division']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Add Customer']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='X']")).click();Thread.sleep(2000);
		
	}

}
