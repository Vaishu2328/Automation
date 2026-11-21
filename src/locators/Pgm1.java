package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pgm1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		WebElement register=driver.findElement(By.className("ico-register"));
		register.click();Thread.sleep(1000);
		
		
		
		WebElement gender=driver.findElement(By.id("gender-female"));
		gender.click();Thread.sleep(1000);
		
		WebElement firstname=driver.findElement(By.id("FirstName"));
		firstname.sendKeys("Sakura");
		
		
		WebElement lastname=driver.findElement(By.id("LastName"));
		lastname.sendKeys("Haruno");
		
		WebElement email=driver.findElement(By.name("Email"));
		email.sendKeys("sakuraharuno123@gmail.com");Thread.sleep(1000);
		
		WebElement password=driver.findElement(By.name("Password"));
		password.sendKeys("123321");Thread.sleep(1000);
		
		
		WebElement confpassword=driver.findElement(By.id("ConfirmPassword"));
		confpassword.sendKeys("123321");Thread.sleep(1000);
		
		driver.close();
	}
}

		 
		 
		 
		 
		
		
		
	
