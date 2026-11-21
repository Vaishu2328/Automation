package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnClear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naukri.com");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[contains(@placeholder,'Enter skills')]"));
		searchBox.sendKeys("Automation Testing");
		Thread.sleep(2000);
	
		searchBox.clear(); Thread.sleep(2000);
		searchBox.sendKeys("QA Engineer"); Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Email ID / Username']")).sendKeys("ABC@gmail.com"); 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//button[text()='Login']")).click(); 
		Thread.sleep(2000);
		WebElement alertMsg = driver.findElement(By.xpath("//div[@class='alert']"));
		
		String text = alertMsg.getText();
		System.out.println(text); 
		Thread.sleep(2000);
		
		driver.quit();
	}
}
