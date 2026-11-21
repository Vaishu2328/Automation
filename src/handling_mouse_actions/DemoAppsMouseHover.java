package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAppsMouseHover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//a[text()='Ratings']")).click();
		WebElement rating = driver.findElement(By.xpath("(//input[@name='radio'])[1]/../../label[4]"));
		Actions a=new Actions(driver);
		a.moveToElement(rating).click();
	
		driver.findElement(By.xpath("//textarea[@placeholder='Description']")).sendKeys("blah blah");
		
		WebElement print = driver.findElement(By.xpath("//p[contains(text(),'Your Rating is')] "));
		String output = print.getText();
		System.out.println(output);
		rating.submit();
		

}
}
