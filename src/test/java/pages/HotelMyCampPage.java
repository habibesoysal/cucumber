package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {

    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=\"Log in\"]")
   public WebElement ilkLoginButton;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement ikinciLoginButton;

    @FindBy(xpath = "//*[text()=\"Hotel Management\"]")
    public WebElement hotelManagement;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[3]")
    public WebElement hotelRooms;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotelRoom;

    @FindBy(xpath = "//select[@id='IDHotel']")
    public WebElement selectHotelTable;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement code;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='Location']")
    public WebElement location;

    @FindBy(xpath = "//textarea[@class='cke_source cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr']")
    public WebElement description;

    @FindBy(xpath = "//input[@id='Price']")
    public WebElement price;

    @FindBy(xpath = "//select[@id='IDGroupRoomType']")
    public WebElement roomTypeTable;

    @FindBy(xpath = "//input[@id='MaxAdultCount']")
    public WebElement adultCount;

    @FindBy(xpath = "//input[@id='MaxChildCount']")
    public WebElement childCount;

    @FindBy(xpath="//input[@id='IsAvailable']")
    public WebElement onayButton;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()=\"HotelRoom was inserted successfully\"]")
    public WebElement hotelAddSuccessfullYazisi;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement addSuccessfullYazisinaOkButton;

    @FindBy(xpath = "(//*[text()=\"List Of Hotelrooms\"])[2]")
    public WebElement listOfHotelroomsYazisi;









}
