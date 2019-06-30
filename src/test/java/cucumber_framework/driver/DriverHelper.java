package cucumber_framework.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverHelper {
    public static WebDriver driver;

    // if we want to use page factory then we need to create a constructor first where you have driver class
    // constructor can be created by using same class name
    public DriverHelper()
    {
        PageFactory.initElements(driver,this);
    }

    public void browserSetUp(String browser) {
        switch (browser) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();// setting an environment to run chrome
                // WebDriverManager.chromedriver().version("2.26").setup();
                //method to port to older versions, force to use version 2.26 of chrome
                driver = new ChromeDriver();
                break;

            case "IE":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;

            default:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
        }
        // driver.get(URL);
    }


    public void maximizewindow() {
        driver.manage().window().maximize();
    }

    public void url(String URL) {
        driver.get(URL);
    }

    public void deletecookie() {
        driver.manage().deleteAllCookies();
    }

    public void privacyfooter() {
        driver.findElement(By.cssSelector(".privacy-prompt-footer")).click();
    }

    public void implicitwait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.quit();
    }
}
