package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldYonoSBI {
	public static void main(String[] args) throws InterruptedException {
        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'icon-cancel')]")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Sakura");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123321");
		
		WebElement eyeIcon = driver.findElement(By.xpath("(//img[@class='ng-star-inserted'])[1]"));
		Actions a =new Actions(driver);
		a.clickAndHold(eyeIcon).perform();
		
		
		
		
	}

}
