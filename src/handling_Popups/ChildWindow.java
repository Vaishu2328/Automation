package handling_Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		String ParentWID=driver.getWindowHandle();
		System.out.println(ParentWID);
		
		 Set<String>allWinID=driver.getWindowHandles();
		 for(String  winID:allWinID) {
			 driver.switchTo().window(winID);
		 }
		 System.out.println(driver.getTitle());
		 driver.quit();

	}

}
