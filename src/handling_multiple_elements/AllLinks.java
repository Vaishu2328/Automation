package handling_multiple_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		List<WebElement> allLink=driver.findElements(By.tagName("a")); 
		int count=allLink.size();
		System.out.println("NO OF LINKS="+count);
		for(int i=0;i<count;i++) {
			WebElement onelink=allLink.get(i);
			String text=onelink.getText();
			System.out.println(text);
		}
		
		
	}

}
