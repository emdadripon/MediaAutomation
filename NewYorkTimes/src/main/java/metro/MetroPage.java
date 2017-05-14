package metro;

import Base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by smhoque on 5/13/17.
 */
public class MetroPage extends CommonAPI {
    public void metroPageNews(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToMetroSections();
    }
}
