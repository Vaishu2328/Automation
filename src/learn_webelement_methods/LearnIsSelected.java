package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsSelected{
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(1000);
	
	
	WebElement radio=driver.findElement(By.xpath("//label[text()='Female']"));
	radio.click();
	boolean res=driver.findElement(By.id("gender-female")).isSelected();
	Thread.sleep(1000);
		
	
	if(res==true) {
		System.out.println("element is selected");
	}
	else {
		System.out.println("element is not selected ");
	}
	
	driver.quit();
	

}
}
