import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chromedriver.", "Asolute path to your chromeDriver");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.expedia.com");

        Thread.sleep(3000);
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='package-origin-hp-package']"));
        searchBox.sendKeys("Chicago");
        //driver.close();
        Thread.sleep(3000);
        WebElement DestinationBox = driver.findElement(By.xpath("//input[@id='package-destination-hp-package']"));
        DestinationBox.sendKeys("New York");

        Thread.sleep(3000);

        WebElement DepartingDate=driver.findElement(By.xpath("//input[@id='package-departing-hp-package']"));
        DepartingDate.sendKeys("6/10/2019");
        Thread.sleep(3000);

        WebElement ReturningDate=driver.findElement(By.xpath("//input[@id='package-returning-hp-package']"));
        ReturningDate.sendKeys("6/15/2019");
        Thread.sleep(3000);

        WebElement SearchButton=driver.findElement(By.xpath("//button[@id='search-button-hp-package']"));
        SearchButton.click();
    }
}
