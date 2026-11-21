package handling_mouse_actions;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoGuruEndToEnd {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions a=new Actions(driver);
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		a.contextClick(rightClick).perform();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());Thread.sleep(2000);
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		
		
		
		
	}

}
