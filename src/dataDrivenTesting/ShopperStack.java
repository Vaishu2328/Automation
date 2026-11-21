
package dataDrivenTesting;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;

public class ShopperStack {

    public static void main(String[] args)
            throws EncryptedDocumentException, IOException {

        FileInputStream fis =new FileInputStream("./data/leafVillage.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
        int rowCount = wb.getSheet("Sheet1").getLastRowNum();
        for (int i = 1; i <= rowCount; i++) {
            String firstName = wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();

            String lastName = wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();

            String mobile = String.valueOf((long)wb.getSheet("Sheet1").getRow(i).getCell(2).getNumericCellValue());

            String email = wb.getSheet("Sheet1").getRow(i).getCell(3).getStringCellValue();

            String password = wb.getSheet("Sheet1").getRow(i).getCell(4).getStringCellValue();

            String confirmPassword = wb.getSheet("Sheet1").getRow(i).getCell(5).getStringCellValue();

            driver.get("https://www.shoppersstack.com/signup");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("First Name"))).sendKeys(firstName);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Last Name"))).sendKeys(lastName);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Phone Number"))).sendKeys(mobile);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email Address"))).sendKeys(email);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password"))).sendKeys(password);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Confirm Password"))).sendKeys(confirmPassword);

            //WebElement terms = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']")));
            
            WebElement terms = driver.findElement(By.id("Terms and Conditions"));

            terms.click();
            driver.findElement(By.xpath("//button[text()='Register']")).click();
            String title = driver.getTitle();
            if (title.toLowerCase().contains("dashboard")) {

                System.out.println("LOGIN PASS : " + email);

            } else {

                System.out.println("LOGIN FAIL : " + email);

            } 

        }

        driver.quit();

    }
}

		

