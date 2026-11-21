
package basics;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

    public static void main(String[] args) {

        // It will launch chrome browser, browser address will be stored in driver variable
        ChromeDriver driver = new ChromeDriver();

        // get(String url) will trigger the application
        // URL should contain protocol, application name, domain name
        driver.get("https://www.google.com");

        // getTitle() is used to fetch the current title of the webPage
        String title = driver.getTitle();
        System.out.println("Title of the WebPage: " + title);

        // getCurrentUrl() is used to fetch the current URL of a webPage
        String url = driver.getCurrentUrl();
        System.out.println("URL of the webpage: " + url);

        // close() will close the current browser window
        driver.close();
    }
}