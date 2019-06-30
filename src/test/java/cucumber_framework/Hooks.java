package cucumber_framework;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber_framework.driver.DriverHelper;

public class Hooks {
    private DriverHelper driverHelper = new DriverHelper();

    @Before
    public void setUp() {
        driverHelper.browserSetUp("Chrome");
        driverHelper.url("https://www.argos.co.uk/");
        driverHelper.maximizewindow();
        driverHelper.implicitwait();
        driverHelper.privacyfooter();
    }

    @After
    public void teardown() {
        driverHelper.deletecookie();
        driverHelper.closeBrowser();
    }
}
