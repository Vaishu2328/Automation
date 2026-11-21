package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetMethods {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement loginbtn=driver.findElement(By.xpath("//div[@class='x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np x972fbf x10w94by x1qhh985 x14e42zd x9f619 xtvsq51 xqbgfmv xbe3n85 x7a1id4 x1d9i5bo x1xila8y x1bumbmr xc8cyl1']"));
		String text=loginbtn.getText();
		String value=loginbtn.getAttribute("role");
		String name=loginbtn.getTagName();
		String css=loginbtn.getCssValue("color");
		
		System.out.println("The text present in the Login button is :" +text);
		System.out.println("The attribute vale of the login button is "+value);
		System.out.println("the Tag name of the login button is "+name);
		System.out.println("The css property font size of the login button is :"+css);
		
		driver.close();
		
		
	}

}
