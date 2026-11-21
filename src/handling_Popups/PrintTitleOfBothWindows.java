package handling_Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitleOfBothWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='click']")).click();Thread.sleep(2000);
		Set<String >allWindowId=driver.getWindowHandles();
		for(String windowId:allWindowId) {
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());Thread.sleep(2000);
			driver.close();
		}
	}

}
