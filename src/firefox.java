
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

    public static void main(String[] args) {

        // Launch Firefox
        WebDriver driver = new FirefoxDriver();

        // Open website
        driver.get("https://www.google.com");

        // Maximize browser
        driver.manage().window().maximize();

        // Print page title
        System.out.println("Page Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }

}

