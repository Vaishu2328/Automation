
package Methods_of_webdriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {

    public static void main(String[] args) throws InterruptedException {

        // ================= CHROME =================
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://www.zomato.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.instagram.com");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        System.out.println("Size: " + driver.manage().window().getSize());
        System.out.println("Position: " + driver.manage().window().getPosition());

        driver.manage().deleteAllCookies();
        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        Thread.sleep(2000);

        driver.manage().window().setSize(new Dimension(800, 600));
        Thread.sleep(2000);

        driver.manage().window().setPosition(new Point(100, 50));
        Thread.sleep(2000);

        String expectedTitle = "Instagram";
        String expectedUrl = "https://www.instagram.com/";
        String actualTitle = driver.getTitle();
        String actualUrl = driver.getCurrentUrl();

        System.out.println("Actual title: " + actualTitle);
        System.out.println("Actual URL: " + actualUrl);

        if (actualTitle.equals(expectedTitle) && actualUrl.equals(expectedUrl)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.manage().window().minimize();
        Thread.sleep(2000);

        driver.quit();

        // ================= EDGE =================
        WebDriver driver1 = new EdgeDriver();
        Thread.sleep(2000);

        driver1.manage().window().maximize();
        Thread.sleep(2000);

        driver1.get("https://www.zomato.com");
        Thread.sleep(2000);

        driver1.navigate().to("https://www.instagram.com");
        Thread.sleep(2000);

        driver1.navigate().back();
        Thread.sleep(2000);

        driver1.navigate().forward();
        Thread.sleep(2000);

        driver1.navigate().refresh();
        Thread.sleep(2000);

        System.out.println("Size: " + driver1.manage().window().getSize());
        System.out.println("Position: " + driver1.manage().window().getPosition());

        driver1.manage().deleteAllCookies();
        Thread.sleep(2000);

        driver1.manage().window().fullscreen();
        Thread.sleep(2000);

        driver1.manage().window().setSize(new Dimension(800, 600));
        Thread.sleep(2000);

        driver1.manage().window().setPosition(new Point(100, 50));
        Thread.sleep(2000);

        actualTitle = driver1.getTitle();
        actualUrl = driver1.getCurrentUrl();

        System.out.println("Actual title: " + actualTitle);
        System.out.println("Actual URL: " + actualUrl);

        if (actualTitle.equals(expectedTitle) && actualUrl.equals(expectedUrl)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver1.manage().window().minimize();
        Thread.sleep(2000);

        driver1.quit();

        // ================= FIREFOX =================
        WebDriver driver2 = new FirefoxDriver();
        Thread.sleep(2000);

        driver2.manage().window().maximize();
        Thread.sleep(2000);

        driver2.get("https://www.zomato.com");
        Thread.sleep(2000);

        driver2.navigate().to("https://www.instagram.com");
        Thread.sleep(2000);

        driver2.navigate().back();
        Thread.sleep(2000);

        driver2.navigate().forward();
        Thread.sleep(2000);

        driver2.navigate().refresh();
        Thread.sleep(2000);

        System.out.println("Size: " + driver2.manage().window().getSize());
        System.out.println("Position: " + driver2.manage().window().getPosition());

        driver2.manage().deleteAllCookies();
        Thread.sleep(2000);

        driver2.manage().window().fullscreen();
        Thread.sleep(2000);

        driver2.manage().window().setSize(new Dimension(800, 600));
        Thread.sleep(2000);

        driver2.manage().window().setPosition(new Point(100, 50));
        Thread.sleep(2000);

        actualTitle = driver2.getTitle();
        actualUrl = driver2.getCurrentUrl();

        System.out.println("Actual title: " + actualTitle);
        System.out.println("Actual URL: " + actualUrl);

        if (actualTitle.equals(expectedTitle) && actualUrl.equals(expectedUrl)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver2.manage().window().minimize();
        Thread.sleep(2000);

        driver2.quit();
    }
}