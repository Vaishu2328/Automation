package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
		
		WebElement f1email = driver.findElement(By.xpath("//p[text()='Email:Admin@gmail.com']"));
		String frame1Mail = f1email.getText().split(":")[1];
		WebElement f1password = driver.findElement(By.xpath("//p[text()='Password : Admin@1234']"));
		String frame1password = f1password.getText().split(": ")[1];
		
		WebElement f1confpassword = driver.findElement(By.xpath("//p[text()='Confirm Password : Admin@1234']"));
		String frame1confpassword = f1confpassword.getText().split(": ")[1];

		WebElement loginUn = driver.findElement(By.xpath("//p[text()='Email:SuperAdmin@gmail.com']"));
		String username = f1confpassword.getText().split(":")[1];
		
		WebElement loginPwd = driver.findElement(By.xpath("//p[text()='Email:SuperAdmin@gmail.com']"));
		String password = f1confpassword.getText().split(": ")[1];
		
		driver.switchTo().frame(0);

		driver.findElement(By.id("email")).sendKeys(frame1Mail);
		driver.findElement(By.id("password")).sendKeys(frame1password);
		driver.findElement(By.id("confirm-password")).sendKeys(frame1confpassword);
		driver.findElement(By.id("submitButton")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
	}
}
