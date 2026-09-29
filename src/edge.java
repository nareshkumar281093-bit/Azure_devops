import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

    public static void main(String[] args) {

        // Launch Microsoft Edge
        WebDriver driver = new EdgeDriver();

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
