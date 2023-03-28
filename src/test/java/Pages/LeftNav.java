package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    // sol taraftaki menuler burda

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "setup":
                return setup;
            case "parameters":
                return parameters;
            case "countries":
                return countries;
            case "citizenShip":
                return citizenShip;
            case "nationalities":
                return nationalities;
            case "Finance":
                return Finance;
            case "Fees":
                return Fees;
        }

        return null;
    }

    @FindBy(xpath = "//span[text()='Finance']")
    public WebElement Finance;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    public WebElement Fees;
}