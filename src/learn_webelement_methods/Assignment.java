package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		WebElement email=driver.findElement(By.xpath("//label[text()='Email:']/../input"));
		WebElement password=driver.findElement(By.xpath("//label[text()='Password:']/../input"));
		
		
		Dimension size1=email.getSize();
		int height1=size1.getHeight();
		int width1=size1.getWidth();
		
		Point loc1=email.getLocation();
		
		int xAxis=loc1.getX();
		int yAxis=loc1.getY();
		
		System.out.println("Height of the email text box is:"+height1);
		System.out.println("Width of th eemail text boz is"+width1);
		
		System.out.println("X coordinare values are:"+xAxis);
		System.out.println("Y axis coordinates are:"+yAxis);
		
		
		Dimension size=password.getSize();
		int height=size.getHeight();
		int width=size.getWidth();
		
		Point loc=password.getLocation();
		
		int xAxis1=loc.getX();
		int yAxis1=loc.getY();
		
		System.out.println("X axis coordinates are "+xAxis1);
		System.out.println("Y AXIS COORDINATES ARE"+yAxis1);
		
		
		if(height1==height && width1==width && xAxis==xAxis1) {
			
			System.out.println("Both the text boxes are rightly alligned");
			
		}
		else {
			System.out.println("Bothe the text boxe are not rightly alligned");
			
			driver.quit();
			
			
		}
		
	}

}
