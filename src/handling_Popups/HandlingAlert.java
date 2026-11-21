package handling_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8));
		driver.get("https://demo.automationtesting.in/Alerts.html");Thread.sleep(2000);
		driver.findElement(By.className("btn-danger")).click();Thread.sleep(2000);
		wait.until(ExpectedConditions.alertIsPresent()).accept();Thread.sleep(2000);
		
		
		
//		driver.switchTo().alert().accept();
//		String text=a.getText();
//		System.out.println(text);
	
	}

}
