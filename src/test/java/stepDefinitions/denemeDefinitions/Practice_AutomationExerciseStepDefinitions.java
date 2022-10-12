package stepDefinitions.denemeDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AutomationExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practice_AutomationExerciseStepDefinitions {

    AutomationExercisePage automationExercisePage = new AutomationExercisePage();
    @Then("Ana sayfanin başariyla görünür oldugunu dogrulayin")
    public void ana_sayfanin_basariyla_gorunur_oldugunu_dogrulayin() {
        String homeUrl ="https://automationexercise.com/";
        Assert.assertEquals("homeUrl esit degil",homeUrl, Driver.getDriver().getCurrentUrl());

    }
    @Then("Test Case buttonu na tiklayin")
    public void test_case_buttonu_na_tiklayin() {
        automationExercisePage.testCaseButton.click();
    }
    @Then("Kullanicinin test case sayfasina başariyla yonlendirildigini dogrulayin")
    public void kullanicinin_test_case_sayfasina_basariyla_yonlendirildigini_dogrulayin() {
        Assert.assertTrue(automationExercisePage.TestcaseTitle.isDisplayed());
    }
    @Then("Ilgili sayfanin ekran goruntusunu alin")
    public void ilgili_sayfanin_ekran_goruntusunu_alin() throws IOException {
        ReusableMethods.getScreenshot("TestCase07 Page");
    }

}
