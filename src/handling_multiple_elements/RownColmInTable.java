package handling_multiple_elements;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RownColmInTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		Thread.sleep(2000);
		
		List<WebElement>tr=driver.findElements(By.tagName("tr"));
		Thread.sleep(1000);
		
		int count=tr.size();
		System.out.println("Number of rows in the Web Table is:"+count);
		
		for(WebElement td:tr) {
			String text=td.getText();
			System.out.println(text);
		}
		driver.quit();
		
	}

}
