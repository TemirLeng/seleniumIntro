import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkSelenium {

    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.expedia.com");
        // driver.manage().window().maximize();

        WebElement searchBox= driver.findElement(By.xpath("//input[@id='package-origin-hp-package']"));
        searchBox.sendKeys(" Chicago");
        // driver.close();
        Thread.sleep(3000) ;

        WebElement destinationBox= driver.findElement(By.xpath("//input[@id='package-destination-hp-package']"));
        destinationBox.sendKeys("New York");
        // driver.close();
        Thread.sleep(3000);

        WebElement departingDate=driver.findElement(By.xpath("//input[@id='package-departing-hp-package']"));
        departingDate.sendKeys("07/07/2019");
        Thread.sleep(3000);


        WebElement returningDate= driver.findElement(By.xpath("//input[@id='package-returning-hp-package']"));
        returningDate.sendKeys("08/02/2019");
        Thread.sleep(3000) ;

        WebElement searchButton= driver.findElement(By.xpath("//button[@id='search-button-hp-package']"));
        searchButton.click();
        Thread.sleep(3000) ;
        // driver.close();
    }






}