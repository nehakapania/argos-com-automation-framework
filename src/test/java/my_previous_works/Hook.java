//package my_previous_works;
//
//import org.junit.After;
//import org.junit.Before;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class Hook {
//    WebDriver driver;
//    @Before
//    public void setUp()
//    {
//        driver = new FirefoxDriver();
//        driver.get("https://www.argos.co.uk/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }
//
//    @After
//    public void closeBrowser()
//    {
//        driver.quit();
//    }
//
//}
