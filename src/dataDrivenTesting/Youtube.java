package dataDrivenTesting;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Youtube {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestCsript");
		Workbook wb = WorkbookFactory.create(fis);
		int rowIndex=wb.getSheet("Yt").getLastRowNum();
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		for(int i=0;i<=rowIndex;i++) {
			
			String input = wb.getSheet("Yt").getRow(i).getCell(0).getStringCellValue();
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
			driver.switchTo().frame(0);
			WebElement ytmusiclogo = driver.findElement(By.xpath("//span[text()='YouTube Music']"));
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollToView(true);",ytlogo);
			Actions a=new Actions(driver);
			a.contextClick(ytmusiclogo).perform();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_T)
			
			
			
		
	
			
		}
		
	}

}
