package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by smhoque on 5/7/17.
 */
public class CommonAPI {
    public static WebDriver driver = null;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "/Users/smhoque/IdeaProjects/Media/Generic/Driver/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.navigate().to("  http://nypost.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Resource closing");
        driver.close();
    }
}
