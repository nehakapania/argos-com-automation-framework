package com.automation.testsuite.pageObjectModel_junit;

import com.automation.testsuite.pageObjectModel_junit.Utilities.DriverManager;
import org.junit.After;
import org.junit.Before;


public class Hooks extends DriverManager{
   // public static WebDriver driver;

    @Before
    public void browserSetUp() {
        openBrowser("Chrome","https://www.argos.co.uk/");
       // driver = new FirefoxDriver();
       // driver.get("https://www.argos.co.uk/");
       // driver.getCurrentUrl();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.findElement(By.cssSelector(".privacy-prompt-footer")).click();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void browserQuit() {
        driver.quit();
    }
}

