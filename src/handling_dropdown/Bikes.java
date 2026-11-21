package handling_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bikes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/91636/Downloads/Bike.html");
		
		WebElement dropDown=driver.findElement(By.id("bike"));
		Select s=new Select(dropDown);
		
		s.selectByContainsVisibleText("R1");Thread.sleep(1000);
		s.selectByIndex(2);Thread.sleep(1000);
		s.selectByValue("3");Thread.sleep(1000);
		s.selectByVisibleText("Kawasaki Ninja");
		
		driver.quit();
		
	}

}
