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

public class SortYearsDescending {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("C:\\Users\\VAISHNAVI V K\\Downloads\\DOB.html");
		WebElement years = driver.findElement(By.id("year-select"));
		Select s = new Select(years);
		List<WebElement> allYearsElements = s.getOptions();
		
		List<String> yearList = new ArrayList<>();
		for (WebElement element : allYearsElements) {
			String text = element.getText();
			if (!text.equalsIgnoreCase("Year")) {
				yearList.add(text);
			}
		}
		Collections.sort(yearList, Collections.reverseOrder());
		
		System.out.println("Years in Descending Order:");
		System.out.println(yearList);
		
		driver.quit();
	}
}
