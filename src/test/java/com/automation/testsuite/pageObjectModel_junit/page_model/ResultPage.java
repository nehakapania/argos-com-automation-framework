package com.automation.testsuite.pageObjectModel_junit.page_model;

import com.automation.testsuite.pageObjectModel_junit.Hooks;
import com.automation.testsuite.pageObjectModel_junit.Utilities.Helpers;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ResultPage extends Hooks {
// created an object of another child class where these methods exist
    // SmokeTestSuitePom resultPage=new SmokeTestSuitePom();

    public void searchAResult(String myExpectedValue) {
        //get the value and  store it in a variable
        String actualSearchValue = driver.findElement(By.cssSelector(".search-title__term")).getText();
        //do assertion on variable
        //Assert.assertEquals(actualSearchValue,myExpectedValue); //assert by junit
        assertThat(actualSearchValue, is(Matchers.equalToIgnoringCase(myExpectedValue))); //Matchers assertion

        System.out.println("Yes Expected equals to actual");
    }


    public void selectARating(String customerRating) {
        //collect web elements for ratings
        List<WebElement> selectRatingOfProducts = driver.findElements(By.cssSelector(".ac-facet__filters--rating .ac-facet__label"));
        //need to find the particular element to click
        for (WebElement selectRatingOfProduct : selectRatingOfProducts) {
            if (selectRatingOfProduct.getText().equalsIgnoreCase(customerRating)) {
                selectRatingOfProduct.click();
                break;
            }
        }
    }

    public List<Double> collectCustomerRating() {
        List<Double> rating = new ArrayList<>(); // storing collected rating in an array list of doubles
        // storing all webelements in a variable
        List<WebElement> starRatingWebElements = driver.findElements(By.cssSelector(".ac-star-rating"));
        for (WebElement starRatingWebElement : starRatingWebElements) {
            // get attribute from DOM
            String collectedRatingInDouble = starRatingWebElement.getAttribute("data-star-rating");
            //System.out.println(collectedRatingInDouble);
            double collectedRating = Double.parseDouble(collectedRatingInDouble);
            //System.out.println(collectedRating);
            rating.add(collectedRating);
            System.out.println(rating);
        }
        return rating;
    }

    public void selectAPrice(String customerSelectedPrice) {
        // collect all the WebElements prices in list
        List<WebElement> selectedPriceOfProducts = driver.findElements(By.cssSelector(".ac-facet__filters--default .ac-facet__label--default"));

        for (WebElement selectedPriceOfProduct : selectedPriceOfProducts) {
            if (selectedPriceOfProduct.getText().equalsIgnoreCase(customerSelectedPrice)) {
                selectedPriceOfProduct.click();
                break;
            }

        }
    }


    public List<Double> selectedCustomerPrice() //Asserting the price which customer selected

    {
        //storing webelements price in list
        List<Double> collectedPrices = new ArrayList<>();
        List<WebElement> selectedPriceOfProducts = driver.findElements(By.cssSelector(".ac-product-price__amount"));
        for (WebElement selectedPriceOfProduct : selectedPriceOfProducts) {
            //System.out.println(selectedPriceOfProduct);
            String priceInString = selectedPriceOfProduct.getText().replace("£", "");
            System.out.println(priceInString);
            double priceInDouble = Double.parseDouble(priceInString);
            collectedPrices.add(priceInDouble);
        }
        return collectedPrices;

    }


    public String selectAProduct() {
        List<WebElement> productWebElements = driver.findElements(By.cssSelector(".ac-product-card__name"));
        int noOfProducts = productWebElements.size(); //get the no of products on web page
        System.out.println(noOfProducts);

        // calling random number generator method of helper class and assigned list of product of webpage
        int randomNumber = new Helpers().randomNumberGenerator(noOfProducts);
        System.out.println(randomNumber);
        // getting the text from UI
        String randomNumberInString = productWebElements.get(randomNumber).getText();
        System.out.println(randomNumberInString);

        productWebElements.get(randomNumber).click();
        driver.findElement(By.cssSelector(".add-to-trolley-main .add-to-trolley-button")).click();//Add to Trolley
        driver.findElement(By.cssSelector(".add-to-trolley-modal__cta .sm-block")).click();//Go to Trolley
        return randomNumberInString;
    }

    public List<String> getProductNamesOfAllProducts() {
        List<String> listOfProducts = new ArrayList<>();
        List<WebElement> addProductsToTrolley = driver.findElements(By.cssSelector(".xsHidden.lgBlock .ProductCard__titleLink__1PgaZ"));
        for (WebElement addProductToTrolley : addProductsToTrolley) {
            listOfProducts.add(addProductToTrolley.getText());
        }
        return listOfProducts;
    }
}




