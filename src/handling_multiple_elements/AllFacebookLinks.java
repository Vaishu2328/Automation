package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllFacebookLinks {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		List<WebElement> allEleAdd=driver.findElements(By.tagName("a"));
		int count=allEleAdd.size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			WebElement eleAddress = allEleAdd.get(i);
			String text= eleAddress.getText();
			System.out.println(text);
		
					
		}
		
		
		
		
		
		
	}

}
