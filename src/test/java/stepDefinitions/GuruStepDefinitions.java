package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage = new GuruPage();

    @Given("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {
        List<WebElement> tabloBaslikListesi=guruPage.baslikListesi;
        /*
        Listemiz WebElementlerden olusuyor
        Dolayisiyla bu webelementlerden hangisi istenen sutun basligini tasiyor bilemeyiz
         */

        int istenenBaslikIndexi=-3;  // - olsun diye rastgele sayi girdik
        for (int i = 0; i < tabloBaslikListesi.size(); i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikIndexi = i+1;
                break;
            }
        }
        /*
        for loop ile tum sutun basliklarini bize verilen istenenSutun degeri ile karsilastirdik
        loop bittiginde basligin bulunup bulunmadigini kontrol etmek ve
        bulundu ise yolumuza devam etmek istiyoruz
         */

        if (istenenBaslikIndexi !=-3){ //baslik bulundu
            List<WebElement> istenenStundakiElementler = Driver.getDriver()
                    .findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));
            for (WebElement each:istenenStundakiElementler
                 ) {
                System.out.println("each = " + each.getText());
            }

        }else System.out.println("istenen baslik bulunamadi");
    }
}
