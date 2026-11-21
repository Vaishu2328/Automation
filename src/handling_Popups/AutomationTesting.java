package handling_Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationTesting {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8));
		driver.get("https://demo.automationtesting.in/Alerts.html");
	
		driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
		
		driver.findElement(By.xpath("//*[text()='click the button to demonstrate the prompt box ']")).click();
		Alert promptAlert = wait.until(ExpectedConditions.alertIsPresent());;
		promptAlert.sendKeys("Sakura");
		promptAlert.accept();
		
		WebElement confirmation = driver.findElement(By.id("demo1"));
        String text = confirmation.getText();
        
        System.out.println(text);
		
	}

}
