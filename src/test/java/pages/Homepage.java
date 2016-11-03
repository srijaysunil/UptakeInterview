package pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Srijays on 11/2/16.
 */
public class Homepage {

    WebDriver driver;
    public Homepage(WebDriver driver){
        this.driver=driver;
    }

    @FindBy (id="menu-item-4164" )
    public WebElement ApproachButton;
    @FindBy (id="menu-item-4163" )
    public WebElement PlatformButton;
    @FindBy (id="menu-item-4172" )
    public WebElement SolutionsButton;
    @FindBy (id="menu-item-4162" )
    public WebElement PeopleButton;
    @FindBy (id="menu-item-4167" )
    public WebElement JoinUsButton;
    @FindBy (id="menu-item-4334" )
    public WebElement ContactUsButton;
    @FindBy (id="menu-item-4166" )
    public WebElement BlogButton;


    public Solutions clickSolutionsButton(){

        SolutionsButton.click();
        return PageFactory.initElements(driver, Solutions.class);
    }
}
