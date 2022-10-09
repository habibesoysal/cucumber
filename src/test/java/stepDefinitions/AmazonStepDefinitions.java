package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import pages.TrendyolMorhipoGoogle;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();



    @Given("kullanici amazon anasayfasinda")
    public void kullaniciAmazonAnasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }

    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String arananKelime ="Nutella";
        String actualKelime = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(arananKelime));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }


    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }

    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String arananKelime ="Java";
        String actualKelime = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(arananKelime));
    }

    @And("kullanici IPhone icin arama yapar")
    public void kullaniciIPhoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("IPhone"+ Keys.ENTER);
    }

    @Then("sonuclarin IPhone icerdigini test eder")
    public void sonuclarinIPhoneIcerdiginiTestEder() {
        String arananKelime ="IPhone";
        String actualKelime = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(arananKelime));
    }


    @And("kullanici {string}icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime+ Keys.ENTER);
        
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {
        String arananKelime =istenenKelime;
        String actualKelime = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(arananKelime));
    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }


    @And("url'nin {string} icerdigini test eder")
    public void urlNinIcerdiginiTestEder(String istenenKelime) {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
