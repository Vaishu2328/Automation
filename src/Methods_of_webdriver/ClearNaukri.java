package Methods_of_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearNaukri {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");Thread.sleep(2000);
		WebElement skills=driver.findElement(By.xpath("//input[contains(@placeholder,'Enter skills')]"));Thread.sleep(2000);
		skills.sendKeys("communication");Thread.sleep(2000);
		skills.clear();Thread.sleep(1000);
		
		
	}

}
