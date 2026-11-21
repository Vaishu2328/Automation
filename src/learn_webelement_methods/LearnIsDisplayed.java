package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsDisplayed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com"); Thread.sleep(2000);
		
		Thread.sleep(2000);
		boolean res=dr.findElement(By.xpath("//div[@class='grid-formation grid-column-6'][1]")).isDisplayed();
		if(res==true) {
			System.out.println("Element is Displayed");
		}
		else {
			System.out.println("element is not displayed");
			
		}
		dr.quit();
		
	}

}
