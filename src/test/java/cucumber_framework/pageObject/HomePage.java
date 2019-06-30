package cucumber_framework.pageObject;

import cucumber_framework.driver.DriverHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverHelper
{
 public static String searchedProduct;  //create a variable to store item which is being searched in searchmethod

     // This is the way to sort code by PageFactory
       @FindBy(id = "searchTerm")
       private WebElement searchTextBox;


    public void doSearch(String item)
    {
         searchedProduct=item;
         searchTextBox.sendKeys(item,Keys.ENTER);

         //This is the old way to call driver
        // driver.findElement(By.id("searchTerm")).sendKeys(item, Keys.ENTER);

    }
    public String getHomepageUrl()
    {
       // String a=driver.getCurrentUrl();
       // return a;
        // this is the another way of returning value, it saves the memory and time
        return driver.getCurrentUrl();
    }

}

