package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_allelements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("drone");
		List<WebElement> collective = driver.findElements(By.xpath("//div[contains(text(),'drone')]"));
		int count=collective.size();Thread.sleep(1000);
		System.out.println(count);Thread.sleep(1000);
		
		for(WebElement unit:collective) {
			String text=unit.getText();
			System.out.println(text);
		}
		collective.get(count-2);
		driver.quit();
		
		
		
		
		
		
	}

}
