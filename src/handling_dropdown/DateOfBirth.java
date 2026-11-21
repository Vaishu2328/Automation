package handling_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateOfBirth {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/91636/Downloads/DOB.HTML");
		
		WebElement day=driver.findElement(By.id("day"));
		Select d=new Select(day);
		d.selectByIndex(29);
		
		WebElement month=driver.findElement(By.id("month"));
		Select mon=new Select(month);
		mon.selectByValue("12");
		
		WebElement year=driver.findElement(By.id("year"));
		Select yr=new Select(year);
		mon.selectByVisibleText("2001");
		
		driver.quit();
		
		
	}

}
