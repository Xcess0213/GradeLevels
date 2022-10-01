package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Driver.driver;

public class Grade_Levels_Elements extends _01_Base_POM {

    public Grade_Levels_Elements() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement clickSetup;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement clickParameters;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevels;

   @FindBy(css = "[class='svg-inline--fa fa-plus']")
    private WebElement plusIcon;

    @FindBy(id = "ms-text-field-3")
    private WebElement addName;

    @FindBy(id = "ms-text-field-4")
    private WebElement addShortName;

    @FindBy(id = "ms-text-field-5")
    private WebElement addOrder;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement clickSave;

    @FindBy(xpath = "//div[text()='The Grade Level with Name \"native2\" already exists.']")
    private WebElement negativeCreateGradeLevels;

    @FindBy(xpath = "(//span[@class='mat-ripple mat-button-ripple mat-button-ripple-round'])[12]")
    private WebElement clickEdit;

    @FindBy(xpath = "//div[text()='Grade Level successfully updated']")
    private WebElement updatedSuccessfullyMessage;

    @FindBy(xpath = "(//span[@class='mat-button-focus-overlay'])[15]")
    private WebElement deleteIcon;

    @FindBy(xpath = "//span[contains(text(),'Delete')] ")
    private WebElement deleteButton;

    public WebElement getClickSetup() {
        return clickSetup;
    }

    public WebElement getClickParameters() {
        return clickParameters;
    }

    public WebElement getGradeLevels() {
        return gradeLevels;
    }

    public WebElement getPlusIcon() {
        return plusIcon;
    }

    public WebElement getAddName() {
        return addName;
    }

    public WebElement getAddShortName() {
        return addShortName;
    }

    public WebElement getAddOrder() {
        return addOrder;
    }

    public WebElement getClickSave() {
        return clickSave;
    }

    public WebElement getClickEdit() {
        return clickEdit;
    }

    public WebElement getUpdatedSuccessfullyMessage() {
        return updatedSuccessfullyMessage;
    }

    public WebElement getDeleteIcon() {
        return deleteIcon;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }
}
