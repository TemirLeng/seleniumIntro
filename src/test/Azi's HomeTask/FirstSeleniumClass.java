import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

    public static void main(String[] args)  throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

       // driver.get("https://www.google.com");

        driver.get("https://www.expedia.com");

        WebElement searchBox=driver.findElement(By.xpath("//input[@id='package-origin-hp-package']"));
      searchBox.click();
       searchBox.sendKeys("Chicago");
        Thread.sleep(2000);


       WebElement des= driver.findElement(By.xpath("//input[@id='package-destination-hp-package']"));
      des.click();
       des.sendKeys("Los Angeles");
       Thread.sleep(2000);


       WebElement departDate =driver.findElement(By.xpath("//input[@id='package-departing-hp-package']"));
       departDate.click();
       departDate.sendKeys("06/15/2019");
        Thread.sleep(2000);


        WebElement arriveDate=driver.findElement(By.xpath("//input[@id='package-returning-hp-package']"));
         arriveDate.click();
        arriveDate.sendKeys("07/15/2019");
        Thread.sleep(2000);

        WebElement searchButton= driver.findElement(By.xpath("//button[@id='search-button-hp-package']"));
        searchButton.click();
        Thread.sleep(2000);

        driver.quit();








    }
}
