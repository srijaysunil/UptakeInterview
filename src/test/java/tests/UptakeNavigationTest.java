package tests;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.Homepage;
import pages.Solutions;

/**
 * Created by Srijays on 11/2/16.
 */
public class UptakeNavigationTest {
    private WebDriver driver;
    private Homepage homepage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/Srijays/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://uptake.com");
        String actualHomeTitle = driver.getTitle();
        String expectedHomeTitle = "Uptake – Analytics for the Industrial Internet";
        Assert.assertEquals(actualHomeTitle, expectedHomeTitle);
        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    @Test
    public void validatePageNavigationToSolutionsPage() {
        Solutions solutions = homepage.clickSolutionsButton();
        String actualSolutionsTitle = driver.getTitle();
        String expectedSolutionsTitle = "Solutions – Uptake";
        Assert.assertEquals(actualSolutionsTitle, expectedSolutionsTitle);
        solutions.goToHomepage();
        String actualHomepageUrl = driver.getCurrentUrl();
        String expectedHomepageUrl = "http://uptake.com/";
        assertEquals(actualHomepageUrl, expectedHomepageUrl);
    }

    @After
    public void cleanUp() {
    driver.close();
}


}
