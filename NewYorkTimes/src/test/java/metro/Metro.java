package metro;

import Base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by smhoque on 5/13/17.
 */
public class Metro extends CommonAPI {
    @Test
    public void metroNews(){
        System.out.println();
        MetroPage metroPage = PageFactory.initElements(driver, MetroPage.class);
        metroPage.metroPageNews();
    }
}
