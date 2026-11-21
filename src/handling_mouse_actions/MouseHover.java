package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoapps.qspiders.com/");

        Actions a = new Actions(driver);

        driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click();
        driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
        driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
        driver.findElement(By.xpath("//*[text()='Tab']")).click();

        // hover chain: Men -> Mens Top Wear -> T-Shirts -> click 10% or more
        WebElement men = driver.findElement(By.xpath("//li[contains(@class,'Men')] "));
        a.moveToElement(men).perform();

        WebElement topWear = driver.findElement(By.xpath("(//span[@class='Dropdown'])[1]"));
        a.moveToElement(topWear).perform();

        WebElement tshirts = driver.findElement(By.xpath("(//span[@class='Dropdown'])[2]"));
        a.moveToElement(tshirts).perform();

        driver.findElement(By.xpath("//*[contains(text(),'10% or more')]")).click();

        driver.quit();
    }
}