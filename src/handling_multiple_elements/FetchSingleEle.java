package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchSingleEle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/big-bang-diwali-store?param=870223");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max" + Keys.ENTER);
		Thread.sleep(2000);

		List<WebElement> allProduct = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 14 Pro Max')]"));

		for (WebElement singleProduct : allProduct) {
			String name = singleProduct.getText();
			String price = singleProduct.findElement
	(By.xpath("//div[contains(text(),'Apple iPhone 14 Pro Max (Space Black, 512 GB)')]/../../div[2]/div")).getText();

			System.out.println("Product: " + name + " and the  Price is : " + price);
		}
		
	}
}