package handling_dropdown;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllMonths {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("C:\\Users\\VAISHNAVI V K\\Downloads\\DOB.html");
		WebElement months=driver.findElement(By.id("month-select"));
		Select s=new Select(months);
		List<WebElement> allmonths=s.getOptions();
		
		List<String> monthNames = new ArrayList<>();
		for (WebElement element : allmonths) {
			monthNames.add(element.getText());
		}
		
		Collections.sort(monthNames);
		System.out.println(monthNames);
		
	}

}
