package Methods_of_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnClear {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		
		WebElement movies=driver.findElement(By.xpath("//a[text()='Movies']"));
		movies.click();
		
		//WebElement search=driver.findElement(By.xpath("//span[@class='sc-1or3vea-15 bMabGE']"));
		//search.sendKeys("Doraemon");
		
		driver.findElement(By.xpath("//span[@class='sc-1qdowf4-0 idXPKI']")).click();
		
		WebElement rating=driver.findElement(By.xpath("//div[@class='sc-1h5m8q1-0 eGIJH']"));
		
		String text=rating.getText();
		System.out.println(text);
		
	}

}
