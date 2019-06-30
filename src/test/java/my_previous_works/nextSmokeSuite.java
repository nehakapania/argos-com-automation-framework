//package my_previous_works;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//public class nextSmokeSuite {
//    WebDriver driver;
//    @Before
//    public void setUp()
//    {
//        driver=new FirefoxDriver();
//        driver.get("https://www.next.co.uk/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }
//@Test
//    public void searchbox()
//    {
//        driver.findElement(By.className("SearchBox")).sendKeys("nike");
//        driver.findElement(By.className("SearchButton")).click();
//        selectGender("Younger Girls");
//    }
//
//    public void selectGender(String customerSelectedGender)
//    {
//        List<WebElement> selectedGender=driver.findElements(By.cssSelector("#gender .OptionName"));
//        for (WebElement selectedGenders:selectedGender)
//        {
//            if(selectedGenders.getText().equalsIgnoreCase(customerSelectedGender))
//            {
//                selectedGenders.click();
//                break;
//            }
//
//        }
//
//
//    }
//}
