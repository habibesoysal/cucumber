package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[.=' Test Cases'])[1]")
    public WebElement testCaseButton;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement TestcaseTitle;
}
