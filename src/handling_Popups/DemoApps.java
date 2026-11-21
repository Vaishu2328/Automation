package handling_Popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoApps {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Popups']")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();Thread.sleep(1000);
		driver.findElement(By.id("fullName")).sendKeys("Sakura");Thread.sleep(1000);
		driver.findElement(By.id("emailId")).sendKeys("sakura@email.com");Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("123321");Thread.sleep(1000);
		driver.findElement(By.id("mobile")).sendKeys("1233211231");Thread.sleep(1000);
		WebElement city = driver.findElement(By.id("city"));Thread.sleep(1000);
		Select s=new Select(city);
		s.selectByVisibleText("Bangalore");Thread.sleep(1000);
		driver.findElement(By.id("resume")).sendKeys("C://Users//91636//Downloads//Surya_Resume (1).pdf");
		
		Thread.sleep(1000);
		 WebElement skill = driver.findElement(By.xpath(
		            "//label[text()='Enter your skills']/../..//select[1]"));
		Select s1=new Select(skill);
		s1.selectByVisibleText("HTML");Thread.sleep(1000);
		s1.selectByValue("CSS");Thread.sleep(1000);
		
		
	}

}
