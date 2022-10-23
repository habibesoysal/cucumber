package stepDefinitions.denemeDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.NegativeLoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class NegativeLoginTestStepDef {

    NegativeLoginPage negativeLoginPage = new NegativeLoginPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
        Driver.getDriver().get(url);
    }
    @When("login olmak icin signin e tiklar")
    public void login_olmak_icin_signin_e_tiklar() {

        negativeLoginPage.signInIcon.click();
        ReusableMethods.waitFor(5);
        negativeLoginPage.signInButton.click();
        ReusableMethods.waitFor(5);
    }
    @When("username icin {string} kullanici adini gonderir")
    public void username_icin_kullanici_adini_gonderir(String username) {
        username= Faker.instance().name().username();
        negativeLoginPage.username.sendKeys(username);
        ReusableMethods.waitFor(5);
    }
    @When("password icin {string} parolasini gonderir")
    public void password_icin_parolasini_gonderir(String password) {
        password= Faker.instance().internet().password();
        negativeLoginPage.password.sendKeys(password);
        ReusableMethods.waitFor(5);
    }
    @When("signine tiklar")
    public void signine_tiklar() {
        negativeLoginPage.submitButton.click();
    }
    @Then("Authentication information not correct uyarisini dogrular")
    public void authentication_information_not_correct_uyarisini_dogrular() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(negativeLoginPage.kaybolanYazi));
        Assert.assertTrue(negativeLoginPage.kaybolanYazi.isDisplayed());
    }

}
