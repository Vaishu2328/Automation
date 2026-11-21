package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();Thread.sleep(1000);
		driver.switchTo().frame(0);Thread.sleep(1000);
		String email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();Thread.sleep(1000);
		String password=driver.findElement(By.xpath("(//p[text()='Admin@1234'])[1]")).getText();Thread.sleep(1000);
		String confPass=driver.findElement(By.xpath("(//p[text()='Admin@1234'])[2]")).getText();Thread.sleep(1000);
		driver.switchTo().frame(0);Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys(email);Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(password);Thread.sleep(1000);
		driver.findElement(By.id("confirm-password")).sendKeys(confPass);Thread.sleep(1000);
		driver.findElement(By.id("submitButton")).submit();Thread.sleep(1000);
		
	}
}
