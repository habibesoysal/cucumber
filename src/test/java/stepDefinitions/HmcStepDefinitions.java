package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelMyCampPage;
import utilities.ConfigReader;

public class HmcStepDefinitions {

    HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
    hotelMyCampPage.ilkLoginButton.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("hotelMyCampValidUsername"));
    }

    @And("gecerli password girer")
    public void gecerliPasswordGirer() {
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hotelMyCampValidPassword"));
    }

    @And("login butonuna basar")
    public void loginButonunaBasar() {
        hotelMyCampPage.ikinciLoginButton.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {
        Assert.assertTrue(hotelMyCampPage.hotelManagement.isDisplayed());
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hotelMyCampWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(hotelMyCampPage.ikinciLoginButton.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("hotelMyCampWrongUsername"));
    }


    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String username) {
        hotelMyCampPage.username.sendKeys(username);
    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
        hotelMyCampPage.password.sendKeys(password);
    }
}
