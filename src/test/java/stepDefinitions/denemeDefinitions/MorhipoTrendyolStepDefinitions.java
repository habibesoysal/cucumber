package stepDefinitions.denemeDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import pages.TrendyolMorhipoGoogle;
import utilities.Driver;

public class MorhipoTrendyolStepDefinitions {

    TrendyolMorhipoGoogle trendyolMorhipoGoogle= new TrendyolMorhipoGoogle();
    int trendyolUrunSayisi;
    int morhipoUrunSayisi;
    String trendyolHandle;


    @And("kullanici googleda {string} aratir")
    public void kullaniciAratir(String istenenKelime) {
        trendyolMorhipoGoogle.googleSearchBox.sendKeys(istenenKelime+ Keys.ENTER);
    }

    @Given("kullanici trendyoldan toplam urun sayisini alir")
    public void kullanici_trendyoldan_toplam_urun_sayisini_alir() {
        String trendyolSonucYazisi= trendyolMorhipoGoogle.trendyolAramaSonucYazisi.getText();
        String [] trendyolSonucArr = trendyolSonucYazisi.split(" ");
        System.out.println("trendyolSonucArr = " + trendyolSonucArr);
        trendyolUrunSayisi = Integer.parseInt(trendyolSonucArr[3]);
    }
    @Given("kullanici morhipodan toplam urun sayisini alir")
    public void kullanici_morhipodan_toplam_urun_sayisini_alir() {
        String morhipoSonucYazisi= trendyolMorhipoGoogle.morhipoAramaSonucYazisi.getText();
        System.out.println("morhipoSonucYazisi = " + morhipoSonucYazisi);
        morhipoUrunSayisi = Integer.parseInt(morhipoSonucYazisi);
    }


    @And("kullanici  trendyolda {string} aratir")
    public void kullaniciTrendyoldaAratir(String istenenKelime) {
        trendyolMorhipoGoogle.googleTrendyolSearch.click();
        trendyolMorhipoGoogle.trendyolSearchBox.sendKeys(istenenKelime+ Keys.ENTER);
        trendyolHandle =Driver.getDriver().getWindowHandle();
    }

    @And("kullanici morhipoda {string} aratir")
    public void kullaniciMorhipodaAratir(String istenenKelime) {
        trendyolMorhipoGoogle.googleMorhipoSearch.click();
        trendyolMorhipoGoogle.morhipoSearchBox.sendKeys(istenenKelime);
        trendyolMorhipoGoogle.morhipoSubmitButton.click();
    }

    @Given("kullanici yeni sekme acar")
    public void kullaniciYeniSekmeAcar() {
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
    }


    @And("iki sitedeki toplam makas sayisini karsilastirir")
    public void ikiSitedekiToplamMakasSayisiniKarsilastirir() {
        System.out.println("trendyolUrunSayisi = " + trendyolUrunSayisi);
        System.out.println("morhipoUrunSayisi = " + morhipoUrunSayisi);
        if (trendyolUrunSayisi>morhipoUrunSayisi) {
            System.out.println("trendyolUrunSayisi daha fazla");
        }else System.out.println("morhipoUrunSayisi daha fazla");

    }

    @Then("Once urun sayisi fazla olan siteyi kapatir")
    public void onceUrunSayisiFazlaOlanSiteyiKapatir() {

        if (trendyolUrunSayisi>morhipoUrunSayisi) {
            Driver.getDriver().switchTo().window(trendyolHandle);
            Driver.closeDriver();
        }
    }

    @And("Sonra diger sayfayida kapatir")
    public void sonraDigerSayfayidaKapatir() {
        Driver.closeDriver();
    }
}
