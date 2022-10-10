package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuappStepDefinition {

    HerokuPage herokuPage = new HerokuPage();
    WebDriverWait wait;
    WebElement element;

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuPage.addElementButton.click();

    }
    @Then("delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        wait= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        element=wait.until(ExpectedConditions.visibilityOf(herokuPage.deleteElementButton));
    }
    @Then("delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuPage.deleteElementButton.isDisplayed());
    }
    @Then("delete butonuna basar")
    public void delete_butonuna_basar() {
        herokuPage.deleteElementButton.click();
    }
    @Then("delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

    }

}
