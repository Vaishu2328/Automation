package handling_Popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String>allWin=driver.getWindowHandles();
		
		Iterator<String> i=allWin.iterator();
		String parent=i.next();
		String child=i.next();
		driver.switchTo().window(child);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parent).close();
		
	}

}
