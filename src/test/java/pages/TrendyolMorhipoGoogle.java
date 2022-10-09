package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolMorhipoGoogle {
    public TrendyolMorhipoGoogle() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement googleSearchBox;

    @FindBy(xpath = "//a[@href='https://www.trendyol.com/']")
    public WebElement googleTrendyolSearch;

    @FindBy(xpath = "(//a[@href='https://www.morhipo.com/'])[2]")
    public WebElement googleMorhipoSearch;

    @FindBy(xpath = "//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']")
    public WebElement trendyolSearchBox;

    @FindBy(xpath = "//div[@class='srch-ttl-cntnr-wrppr']")
    public WebElement trendyolAramaSonucYazisi;

    @FindBy(xpath = "//input[@id='pw-search-input']")
    public WebElement morhipoSearchBox;

    @FindBy(xpath = "//button[@class='btn btn-search pw-search-submit']")
    public WebElement morhipoSubmitButton;

@FindBy(xpath = "//div[@class='col-xxs-5 col-xs-4 col-sm-3 col-md-2 total_prod_count count-text text-center']")
    public WebElement morhipoAramaSonucYazisi;





}
