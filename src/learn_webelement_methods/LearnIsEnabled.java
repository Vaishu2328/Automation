package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsEnabled {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//li[text()='Disabled']")).click();Thread.sleep(2000);
	boolean res=driver.findElement(By.xpath("//input[@name='name']")).isEnabled();Thread.sleep(2000);
	
	
	if(res==true) {
		System.out.println("element is enabled");
	}
	else {
		System.out.println("element is disabled ");
	}
	
	driver.quit();
	

}
}
