import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework {
    public static void main(String[] args)throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();


        driver.get("https://www.expedia.com");

        WebElement searchBox= driver.findElement(By.xpath("//input[@id='package-origin-hp-package']"));
        searchBox.sendKeys("Chicago");



        WebElement departingDate= driver.findElement(By.xpath("//input[@id='package-destination-hp-package']"));
        departingDate.sendKeys("New York");
        Thread.sleep(2000);


        WebElement destinationBox= driver.findElement(By.xpath("//input[@id='package-departing-hp-package']"));
        destinationBox.sendKeys("08/06/2019");
        Thread.sleep(2000);

        WebElement returningDate= driver.findElement(By.xpath("//input[@id='package-returning-hp-package']"));
        returningDate.sendKeys("09/01/2020");
        Thread.sleep(2000);

        WebElement searchButton= driver.findElement(By.xpath("//button[@id='search-button-hp-package']"));
        searchButton.click();
        Thread.sleep(2000);
        // driver.close();



    }
}

