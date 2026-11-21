package handling_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FreshersWorld {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.freshersworld.com/");
		
		driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sakura");
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("Sakura@email.com");
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("1234567890");
		//driver.findElement(By.xpath("//input[@placeholder='Date of Birth']")).sendKeys("28/12/2001");
		WebElement quali=driver.findElement(By.xpath("(//optgroup)[1]//option[6]"));
		
		Select s=new Select(quali);
		s.selectByValue("34");
		
		
	}
	
}
