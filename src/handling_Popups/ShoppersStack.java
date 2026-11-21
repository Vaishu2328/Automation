package handling_Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.id("Email")).sendKeys("playwrightautomation1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Playwright@987");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("//span[text()='MAYBELLINE']")).click();
		WebElement price=driver.findElement(By.xpath("//h2[text()='maybelline']/../../div[5]/div/p/span"));
	    String pricetxt=price.getText();
	    System.out.println(pricetxt);
	    WebElement productName = driver.findElement(By.xpath("//h2[text()='maybelline']")); 
        String productTxt = productName.getText();
        System.out.println(productTxt);
        driver.findElement(By.xpath("//h2[text()='maybelline']/../../div[4]/h6/button")).click();
        
        Set<String >allwin=driver.getWindowHandles();
        for (String onewin : allwin) {
        	driver.switchTo().window(onewin);
        	String title=driver.getTitle();
        	if(title.contains("Amazon")){
        		driver.manage().window().maximize();
        		break; 
        		
        	}
			
		}
        driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys(productTxt);
        	 
		
	}

}
