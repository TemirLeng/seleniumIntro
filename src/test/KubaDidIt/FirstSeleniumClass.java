import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.expedia.com");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='package-origin-hp-package']"));
        searchBox.sendKeys("Chicago");


        WebElement destinationSearchBox = driver.findElement(By.xpath("//input[@id='package-destination-hp-package']"));
        Thread.sleep(2000);
        destinationSearchBox.sendKeys("Los Angeles");

        WebElement departingDateSearchBox = driver.findElement(By.xpath("//input[@id='package-departing-hp-package']"));
        departingDateSearchBox.sendKeys("06/10/2019");

        WebElement returnignDateSearchBox = driver.findElement(By.xpath("//input[@id='package-returning-hp-package']"));
        returnignDateSearchBox.sendKeys("07/01/2019");

        WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-button-hp-package']"));
        searchButton.click();




    }
}
