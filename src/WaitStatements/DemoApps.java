package WaitStatements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoApps {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.id("Email")).sendKeys("vaishuemail.com");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains("Demo"));
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		
		WebDriverWait wait1 =new WebDriverWait(driver,Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.titleContains("Books"));
		String title2=driver.getTitle();
		System.out.println(title2);
		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		WebElement ele=driver.findElement(By.xpath("(//span[contains(text(),'Total:')])[3]/../../td[2]/span/span/Strong"));
		String total=ele.getText();
		System.out.println(total);
		
		driver.quit();
	
		
		
		
		
		
	}

}
