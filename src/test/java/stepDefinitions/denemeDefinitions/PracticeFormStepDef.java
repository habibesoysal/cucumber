package stepDefinitions.denemeDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.PracticeFormPage;
import utilities.Driver;

import java.util.Random;

public class PracticeFormStepDef {

    PracticeFormPage practiceFormPage = new PracticeFormPage();


    @And("dosyanin yuklendigini dogrular")
    public void dosyanin_yuklendigini_dogrular() {
    }
    @And("submite tiklar")
    public void submiteTiklar() {
        practiceFormPage.submitButton.click();
    }

    @And("dropdown itmem{int} secer")
    public void dropdownItmemSecer(int arg0) {
        Select select = new Select(practiceFormPage.dropDown);
        Random random = new Random();
        int rastgele=random.nextInt(select.getOptions().size()-1);
        select.selectByIndex(rastgele);
    }

    @And("selection item{int} secer")
    public void selectionItemSecer(int arg0) {
        practiceFormPage.selectItem3.click();
    }

    @And("radio{int} yi secer")
    public void radioYiSecer(int arg0) {
        practiceFormPage.radioButton2.click();
    }

    @And("checkbox{int} i secer")
    public void checkboxISecer(int arg0) {
        if (!practiceFormPage.checkBox1.isSelected()) {
            practiceFormPage.checkBox1.click();
        }
        if (practiceFormPage.checkBox2.isSelected()) {
            practiceFormPage.checkBox2.click();
        }
        if (practiceFormPage.checkBox3.isSelected()) {
            practiceFormPage.checkBox3.click();
        }


    }

    @And("bir dosya yukler")
    public void birDosyaYukler() {
        //practiceFormPage.chooseFile.sendKeys("C:\\Users\\busra\\OneDrive\\Masaüstü\\test.txt");
        String homeDirectory= System.getProperty("user.home");
        String filePath =homeDirectory+"/OneDrive/Masaüstü/test.txt";
        practiceFormPage.chooseFile.sendKeys(filePath);

    }

    @When("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void usernamePasswordVeTextareaKisimlariniDoldurur(String username, String password, String textarea) {
        username= Faker.instance().name().username();
        password= Faker.instance().name().username();
        textarea= Faker.instance().name().username();

        practiceFormPage.username.sendKeys(username);
        practiceFormPage.password.sendKeys(password);
        practiceFormPage.textarea.sendKeys(textarea);
    }


    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }
}
