package stepDefinitions.denemeDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.TutorialsNinjaPage;
import utilities.Driver;

import java.util.List;

public class TutorialsNinjaStepDefinitions {

    TutorialsNinjaPage tutorialsNinjaPage = new TutorialsNinjaPage();
    Actions actions = new Actions(Driver.getDriver());
    List<String>telefonMarkalariList;
    List<String>sepettekiUrunlerList;
    @Then("kullanici Phones & PDAs'a tiklar")
    public void kullaniciphonespdasatiklar() {
        tutorialsNinjaPage.PhonesPDAs.click();
    }


    @And("telefon markalarini alir")
    public void telefonMarkalariniAlir() {

        for (WebElement each:tutorialsNinjaPage.telefonlarListi
             ) {
            telefonMarkalariList.add(each.getText());
        }
    }

    @Then("tum ogeleri sepetine ekler")
    public void tumOgeleriSepetineEkler() throws InterruptedException {
        for (int i = 0; i < tutorialsNinjaPage.addToCartListi.size(); i++) {
            tutorialsNinjaPage.addToCartListi.get(i).click();
        }

    }

    @And("sepetteki isimleri alir")
    public void sepettekiIsimleriAlir() {
        tutorialsNinjaPage.sepetButton.click();
        for (WebElement each:tutorialsNinjaPage.sepettekiUrunlerListi
             ) {
            sepettekiUrunlerList.add(each.getText());
        }


    }


    @And("sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastirir")
    public void sepettekiVeSayfadakiUrunlerinDogruOldugunuKarsilastirir() {
        Assert.assertEquals(sepettekiUrunlerList,telefonMarkalariList);
    }

    @Given("kullanici TutorialsNinja anasayfasinda")
    public void kullaniciTutorialsNinjaAnasayfasinda() {
        Driver.getDriver().get("http://tutorialsninja.com/demo/index.php?route=common/home");
    }
}
