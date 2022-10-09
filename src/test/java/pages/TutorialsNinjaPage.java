package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialsNinjaPage {
    public TutorialsNinjaPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=\"Phones & PDAs\"]")
    public WebElement PhonesPDAs;

    @FindBy(xpath = "//h4")
    public List<WebElement> telefonlarListi;

    @FindBy(xpath = "//span[text()=\"Add to Cart\"]")
    public List<WebElement> addToCartListi;

    @FindBy(xpath = "(//span[text()=\"Add to Cart\"])[1]")
    public WebElement addToCartBirTane;


    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement sepetButton;

    @FindBy(xpath = "//*[text()=' View Cart']")
    public WebElement sepetButonu2;

    @FindBy(xpath = "//tbody//tr//td[@class='text-left']")
    public List<WebElement> sepettekiUrunlerListi;

}
