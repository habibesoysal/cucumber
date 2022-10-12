package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    StepDefinitions package icerisinde @before @after gibi bir notasyon varsa
    Cucumberda extends TestBase dememize gerek kalmadan
    her scenariodan once ve/veya sonra bu methodlar calisacaktir

    Bu istenilen bir durum degildir

    Cucumber da @before @after kullanma ihtiyacimiz olursa
    bunu stepDefinitions package altında olusturacagimiz hook clasina koyariz

    biz her scenariodan sonra test sonucunu kontrol edip
    failed olan scenariolar icin screenshoot almasi amaciyla
    @After method kullanacagiz
     */

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshoot= ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){
            scenario.attach(screenshoot,"image/png","screenshoots");
        }
        Driver.closeDriver();
    }
}
