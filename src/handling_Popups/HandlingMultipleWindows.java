package handling_Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.findElement(By.xpath("//*[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//*[text()='Shop Now']")).click();
		String parent=driver.getWindowHandle();
		Set<String>all=driver.getWindowHandles();
		for ( String one : all) {
			driver.switchTo().window(one);
			if(one!=parent) {
				driver.close();
			}
			
			
		}
		
	}

}
