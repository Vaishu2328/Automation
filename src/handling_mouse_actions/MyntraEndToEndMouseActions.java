package handling_mouse_actions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraEndToEndMouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(8));
		
		driver.get("https://www.myntra.com/");
		//wait.until(ExpectedConditions.alertIsPresent()).accept();Thread.sleep(2000);
		WebElement women = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
		Actions a=new Actions(driver);Thread.sleep(1000);
		a.moveToElement(women).perform();
		WebElement heels = driver.findElement(By.xpath("//a[text()='Heels']"));Thread.sleep(1000);
		a.moveToElement(heels).click().perform();
		WebElement price = driver.findElement(By.id("rootRailThumbRight"));Thread.sleep(1000);
		a.clickAndHold(price).moveByOffset(-20,0).release().perform();Thread.sleep(1000);
		WebElement page1 = driver.findElement(By.xpath("//ul[@class='pagination-container']/li"));
		a.scrollToElement(page1).perform();
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		
		Set<String>lastprod=driver.getWindowHandles();
		for(String one:lastprod) {
			driver.switchTo().window(one);
			
		}
		WebElement amount = driver.findElement(By.xpath("//strong/../../../../div/p/span"));Thread.sleep(1000);
		String text=amount.getText();
		System.out.println(text);
		
		
		
				
	}

}
