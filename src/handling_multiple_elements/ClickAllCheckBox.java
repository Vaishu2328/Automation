package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Selected']")).click();
		Thread.sleep(1000);
		List<WebElement>allCheck=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement one:allCheck) {
			one.click();
		}
		Thread.sleep(3000);
		driver.quit();
		
	}

}
