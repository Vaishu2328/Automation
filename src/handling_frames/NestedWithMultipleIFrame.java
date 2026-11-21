package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedWithMultipleIFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		driver.findElement(By.xpath("//a[text()='Nested with Multiple iframe']")).click();
		WebElement eleaddress1 = driver.findElement(By.xpath("//iframe[contains(@class,'w-full h')]"));
		driver.switchTo().frame(eleaddress1);
		String email=driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		System.out.println(email);
		//String password=driver.findElement(By.xpath("//p[text()='Admin@1234']")).getText();
		//String conpass=driver.findElement(By.xpath("//p[text()='Admin@1234']")).getText();
		
		
		//driver.switchTo().frame(0);
		
		//driver.findElement(By.id("email")).sendKeys(email);
		//driver.switchTo().parentFrame();
		//driver.switchTo().frame(1);
		
		//driver.findElement(By.id("password")).sendKeys(password);
		//driver.switchTo().parentFrame();
		//driver.switchTo().frame(2);
		
		//driver.findElement(By.id("confirm")).sendKeys(conpass);
	}
}
