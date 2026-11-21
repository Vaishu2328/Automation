package handling_Popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Popups']")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Javascript']")).click();Thread.sleep(1000);
		List<WebElement> allCheckBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement oneCheck:allCheckBoxes) {
			oneCheck.click();
		}
		driver.findElement(By.xpath("//*[text()='Delete']")).click();Thread.sleep(1000);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	}

}
