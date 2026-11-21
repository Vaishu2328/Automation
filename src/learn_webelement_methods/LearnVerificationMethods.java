package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnVerificationMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		Thread.sleep(5000);
		boolean res = driver.findElement(By.xpath("//div[text()='My Profile']")).isDisplayed();

		if (res == true) {
			System.out.println("Element is displayed");
		} else {
			System.out.println("Element is not displayed");
		}
		
		driver.navigate().to("https://qspiders.com");
		// driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		boolean res2 = driver.findElement(By.id("name")).isEnabled();
	
		if (res2 == true) {
			System.out.println("Element is enabled");
		} else {
			System.out.println("Element is disabled");
		}
	}
}
