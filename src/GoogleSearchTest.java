import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

    public static void main(String[] args) {

        // Start Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Maximize browser
        driver.manage().window().maximize();

        // Enter search text
        driver.findElement(By.name("q"))
              .sendKeys("Selenium WebDriver");

        // Press Enter
        driver.findElement(By.name("q"))
              .submit();

        // Print page title
        System.out.println("Page Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}