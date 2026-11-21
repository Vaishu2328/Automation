package handling_multiple_elements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAllCheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		
		Thread.sleep(1000);
		List<WebElement> allCheckBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(1000);
		int count=allCheckBox.size();
		System.out.println(count);
		int rescount=0;
		for(WebElement one:allCheckBox) {
			one.click();
			if(one.isSelected()) {
				rescount++;
			}
			
		}
		if(rescount==10) {
			System.out.println("All "+rescount+" checkboxes are selected");
		}
		driver.quit();
		
	}

}
