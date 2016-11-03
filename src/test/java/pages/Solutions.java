package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Srijays on 11/2/16.
 */
public class Solutions {
    WebDriver driver;
    public Solutions (WebDriver driver){
        this.driver=driver; }

    @FindBy (className = "l-site-header__logo")
    public WebElement BigUptakeLogo;
    @FindBy(id="menu-item-4164" )
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

    public void goToHomepage(){
        BigUptakeLogo.click();

    }
}
