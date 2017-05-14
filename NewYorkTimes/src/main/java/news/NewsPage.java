package news;

import Base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by smhoque on 5/13/17.
 */
public class NewsPage extends CommonAPI {
    @FindBy(how = How.CSS, using = ".postid-10943106")
    public static WebElement newsHeader;

    public static WebElement getNewsHeader() {
        return newsHeader;
    }
    public static void clickOnHeadline(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToMetroSections();
        getNewsHeader().click();
    }
}
