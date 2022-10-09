package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /*
    POM' de Driver icin TestBase classina extends etmek yerine
    Driver classindan static methodlar kullanarak driver olusturup,
    ilgili ayarlarin yapilmasi ve en sonda driverin kapatilmasi tercih edilir

    POM2 de Driver classindaki getDriver()'in obje olusturularak kullanilmasini
    engellemek icin Singleton pattern kullanimi benimsenmistir

    Singleton pattern : tekli kullanim, bir classin farkli classlardan
    obje olusturularak kullanimini engellemek icin kullanilir

    Bunu saglamak icin yapmamiz gereken sey oldukca basit
    obje olusturmak icin kullanilan constructori private yaptigimizda
    baska classlarda Driver classindan obje olusturulmasi mumkun olmaz
     */

    private Driver(){

    }

    static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver == null){
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver =new ChromeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver =new SafariDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver =new FirefoxDriver();
                    break;
                 case "edge":
                     WebDriverManager.edgedriver().setup();
                     driver =new EdgeDriver();
                default:
                    WebDriverManager.chromedriver().setup();
                    driver =new ChromeDriver();

            }



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

        return driver;
    }

    public static void closeDriver() {
        if (driver!=null){
            driver.quit();
            driver = null;
        }

    }


}
