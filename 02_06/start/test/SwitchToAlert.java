import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;


public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Carlos Bermudez\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = driver.findElement(By.id("alert-button"));
        Thread.sleep(8000);
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(8000);
        alert.accept();
        Thread.sleep(8000);

        driver.quit();
    }
}
