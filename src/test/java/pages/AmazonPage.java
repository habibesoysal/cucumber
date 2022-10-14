package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

   public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath ="//div[@class='a-section a-spacing-small a-spacing-top-small']" )
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement eMailBox;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[.='There was a problem']")
    public WebElement problemMessage;

    @FindBy(xpath = "//span[@class='a-expander-prompt']")
    public WebElement needHelpYAzisi;

    @FindBy(xpath = "//a[@id='auth-fpp-link-bottom']")
    public WebElement forgetYourPasswordButton;

    @FindBy(xpath = "//h1")
    public WebElement passwordAssistanceText;

    @FindBy(xpath = "//a[@id='createAccountSubmit']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//h1")
    public WebElement createAccountText;





}
