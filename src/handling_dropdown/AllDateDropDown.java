package handling_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllDateDropDown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("C:\\Users\\VAISHNAVI V K\\Downloads\\DOB.html");
		WebElement days=driver.findElement(By.name("day"));
		Select s=new Select(days);
		List<WebElement> alldays=s.getOptions();
		for(WebElement day:alldays) {
			System.out.println(day.getText());
		}
		
		
		
	}

}
