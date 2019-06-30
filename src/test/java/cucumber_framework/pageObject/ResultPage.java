package cucumber_framework.pageObject;

import cucumber_framework.driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ResultPage extends DriverHelper
{
    public static String expectedCustomerRating;
    public static String expectedCustomerPrice;

    @FindBy(css = ".search-title__term")
    private WebElement resultOfSearchHeader;

    public String searchHeaderName()
    {
        // String actualHeaderName= driver.findElement(By.cssSelector(".search-title__term")).getText();
        //return actualHeaderName;
        //return driver.findElement(By.cssSelector(".search-title__term")).getText();
        return resultOfSearchHeader.getText(); // pagefactory web element
    }

    @FindBy(css = ".ac-facet__filters--rating .ac-facet__label--rating ")
    private List<WebElement> customerRatings;

    public void selectARating(String customerSelectedRating) {
        for (WebElement customerRating : customerRatings) {

            if (customerRating.getText().equalsIgnoreCase((customerSelectedRating))) {
                customerRating.click();
                break;
            }
        }
    }
        //this is the old method without PageFActory
        /***List<WebElement> customerRatings=driver.findElements(By.cssSelector(".ac-facet__filters--rating .ac-facet__label--rating "));
         for(WebElement customerRating:customerRatings )
         {
         if(customerRating.getText().equalsIgnoreCase(customerSelectedRating))
         {
         customerRating.click();
         break;
         }
         }**/


    @FindBy(css = ".ac-star-rating")
    private List<WebElement> ratingOnAllProducts;


    public List<Double> verifyRatingOnProducts() {
        // List<WebElement> ratingOnProducts=driver.findElements(By.cssSelector(".ac-star-rating"));

        List<Double> collectedRatingOnAllProducts = new ArrayList<>();

        for (WebElement ratingOnAllProduct : ratingOnAllProducts)
        {

          String collectedRatingInString=ratingOnAllProduct.getAttribute("data-star-rating");
          double collectedRatingInDouble=Double.parseDouble(collectedRatingInString);
          collectedRatingOnAllProducts.add(collectedRatingInDouble);
          // collectedRatingOnAllProducts.add(Double.parseDouble(ratingOnAllProduct.getAttribute(String.valueOf(collectedStarRating))));
        }
           return collectedRatingOnAllProducts;

    }




    public List<Double> checkProductsRating() {
        List<Double> selectedProductRating = new ArrayList<>();
        List<WebElement> productsRating = driver.findElements(By.cssSelector(".ac-star-rating "));
        for (WebElement productRating : productsRating)
        {
            String ratingOfProduct = productRating.getAttribute("data-star-rating");
            double ratingInDouble = Double.parseDouble(ratingOfProduct);
            selectedProductRating.add(ratingInDouble);
        }
        return selectedProductRating;
    }










    public void selectAPrice(String customerSelectedPrice) {
        List<WebElement> productsPriceRange = driver.findElements(By.cssSelector(".ac-facet__filters--default .ac-facet__label--default "));
        for (WebElement productPriceRange : productsPriceRange) {
            if (productPriceRange.getText().equalsIgnoreCase(customerSelectedPrice)) {
                expectedCustomerPrice = customerSelectedPrice;
                productPriceRange.click();
                break;
            }
        }
    }
}


