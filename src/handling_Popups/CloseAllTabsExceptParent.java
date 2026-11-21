package handling_Popups;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllTabsExceptParent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product to add to cart");
		String product = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//*[text()='Popups']")).click();
		driver.findElement(By.xpath("//*[text()='Browser Windows']")).click();
		driver.findElement(By.xpath("//*[text()='Multiple Tabs']")).click();
		
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='Shop Now']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		for (String one : allWindows) {
			if (!one.equals(parentWindow)) {
				driver.switchTo().window(one);

				if (driver.getPageSource().contains(product)) {
					driver.findElement(By.xpath("//*[contains(text(),'" + product + "')]/ancestor::div[1]//button[contains(text(),'Add')]")).click();
				}
				
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		sc.close();
	}
}
