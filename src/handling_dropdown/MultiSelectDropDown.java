package handling_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/91636/Downloads/IPL.html");
		
		WebElement multiSelect=driver.findElement(By.id("player"));
		Select s=new Select(multiSelect);
		
		List<WebElement>allOptions=s.getOptions();
		for(WebElement oneOpt:allOptions) {
			String all=oneOpt.getText();
			System.out.println(all);
			
		}
		s.selectByContainsVisibleText("Virat");Thread.sleep(500);
		s.selectByIndex(1);Thread.sleep(500);
		s.selectByValue("C");Thread.sleep(500);
		s.selectByVisibleText("Dhoni");Thread.sleep(500);
		
		
		List<WebElement> allSelected=s.getAllSelectedOptions();
		int count=allSelected.size();
		for(int i=0;i<count;i++) {
			WebElement one=allSelected.get(i);
			String text=one.getText();
			System.out.println("All the selected players are :"+text);
		}
		
		
		//s.deSelectByContainsVisibleText("Dh");Thread.sleep(500);
		//s.deselectByIndex(2);Thread.sleep(500);

		//s.deselectByValue("B");Thread.sleep(500);
		//s.deselectByVisibleText("Viratkohli");Thread.sleep(500);
		
		//s.deselectAll();
		WebElement first=s.getFirstSelectedOption();
		String text=first.getText();
		System.out.println("The first selected option in a multi select dropdown is:"+text);
		
		
		WebElement singleSelect=driver.findElement(By.id("team"));
		Select s1=new Select(singleSelect);
		s1.selectByIndex(1);
		
		
			
	}

}
