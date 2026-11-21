package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Localhost {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://49.249.29.4:8888");
		
		WebElement un=driver.findElement(By.xpath("//input[@name='user_name']"));
		un.sendKeys("admin");Thread.sleep(1000);	
		
		WebElement pwd=driver.findElement(By.xpath("//input[@name='user_password']"));
		pwd.sendKeys("admin");
		
		WebElement login=driver.findElement(By.xpath("//input[@id='submitButton']"));
		login.click();Thread.sleep(1000);	
		
		WebElement contact=driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']"));
		contact.click();
		
		WebElement add=driver.findElement(By.xpath("//img[@title='Create Contact...']"));
		add.click();
		Thread.sleep(1000);	
		
		WebElement fn=driver.findElement(By.xpath("//input[@name='firstname']"));
		fn.sendKeys("Sakura");Thread.sleep(1000);	
		
		WebElement ln=driver.findElement(By.xpath("//input[@name='lastname']"));
		ln.sendKeys("Haruno");Thread.sleep(1000);	
		
		//WebElement save=driver.findElement(By.xpath("//input[@title='Save [Alt+S]']"));
		//save.click();Thread.sleep(2000);	
		
		//WebElement orgname=driver.findElement(By.xpath("//input[@ name='account_name']"));
		//orgname.sendKeys("Qspiders");Thread.sleep(1000);	
		
		WebElement title=driver.findElement(By.xpath("//input[@name='title']"));
		title.sendKeys("ABC123");Thread.sleep(1000);
		
		WebElement dept=driver.findElement(By.xpath("//input[@name='department']"));
		dept.sendKeys("NOT SURE");Thread.sleep(1000);
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("blahblah@gmail.com");Thread.sleep(1000);
		
		WebElement assistant=driver.findElement(By.xpath("//input[@id='assistant']"));
		assistant.sendKeys("idk");Thread.sleep(1000);
		
		WebElement assisphn=driver.findElement(By.xpath("//input[@id='assistantphone']"));
		assisphn.sendKeys("idk");Thread.sleep(1000);
		
		WebElement emailopt=driver.findElement(By.xpath("//input[@name='emailoptout']"));
		emailopt.click();Thread.sleep(1000);
		
		WebElement reference=driver.findElement(By.xpath("//input[@name='reference']"));
		reference.click();Thread.sleep(1000);
		
		WebElement notify_owner=driver.findElement(By.xpath("//input[@name='notify_owner']"));
		notify_owner.click();Thread.sleep(1000);
		
		
		WebElement save=driver.findElement(By.xpath("//input[@title='Save [Alt+S]']"));
		save.click();Thread.sleep(1000);
			
		
		driver.close();
	
		
	}

}
