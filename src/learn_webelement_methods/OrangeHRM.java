package learn_webelement_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(3));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 String username=d.findElement(By.name("username")).getText();
		 String password=d.findElement(By.name("password")).getText();
		 System.out.println(username);
		 System.out.println(password);
		 username=username.substring(10);
		 password=password.substring(10);
		 System.out.println(username);
		 System.out.println(password);
		 d.findElement(By.name("username")).sendKeys(username);
		 d.findElement(By.name("password")).sendKeys(password);
		 
		 
		 
	}

}
