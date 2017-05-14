package news;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
/**
 * Created by smhoque on 5/13/17.
 */
public class News extends CommonAPI {

    @Test
    public void headlineNews(){
        NewsPage newsPage = PageFactory.initElements(driver, NewsPage.class);
        newsPage.clickOnHeadline();

    }
}
