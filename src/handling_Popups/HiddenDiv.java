package handling_Popups;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDiv {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//*[text()='Popups']")).click();
		driver.findElement(By.xpath("//*[text()='Hidden division']")).click();
		driver.findElement(By.xpath("//*[text()='Add Customer']")).click();
		
		driver.findElement(By.name("name")).sendKeys("Sakura");Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("Sakura@email.com");Thread.sleep(1000);
		
		WebElement product=driver.findElement(By.name("product"));
		Select s=new Select(product);
		s.selectByVisibleText("Mobile");Thread.sleep(1000);
		
		driver.findElement(By.name("message")).sendKeys("Idk what to write im just writing something ");Thread.sleep(1000);
		driver.quit();
	
	}

}
