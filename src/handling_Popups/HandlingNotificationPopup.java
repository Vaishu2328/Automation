package handling_Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotificationPopup {
	public static void main(String[] args) {
		ChromeOptions opts=new ChromeOptions();
		
		opts.addArguments("--disable-notifications");
//		opts.addArguments("--start-maximized");
//		opts.addArguments("--headless");
//		opts.addArguments("--incognito");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.yatra.com/");
		System.out.println(driver.getTitle());
	}

}
