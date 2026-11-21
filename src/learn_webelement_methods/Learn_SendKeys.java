
package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_SendKeys {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String username = driver.findElement(
            By.xpath("//p[text()='Username : Admin']")).getText();
            
        String password = driver.findElement(By.xpath("//p[text()='Password : admin123']")).getText();
        username=username.substring(11);
        password=password.substring(11);
      


        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

    }
}


