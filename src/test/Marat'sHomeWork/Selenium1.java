import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstseleniumclass {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.expedia.com");
        WebElement origin= driver.findElement(By.xpath("//input[@id='package-origin-hp-package']"));
        origin.click();
        origin.sendKeys("Bishkek");
        Thread.sleep(2000);

        WebElement destination =driver.findElement(By.xpath("//input[@id='package-destination-hp-package']"));
        destination.click();

        destination.sendKeys(" Moscow");

        WebElement departing= driver.findElement(By.xpath("//input[@id='package-departing-hp-package']"));
        departing.click();
        departing.sendKeys("07/01/2019");
        Thread.sleep(2000);

        WebElement returning= driver.findElement(By.xpath("//input[@id='package-returning-hp-package']"));
        returning.click();
        returning.sendKeys("07/04/2019");

        WebElement click = driver.findElement(By.xpath("//button[@id='search-button-hp-package']")); //button[@id='search-button-hp-package']
        click.click();
