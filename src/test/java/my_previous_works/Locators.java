//package my_previous_works;
//
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Locators extends Hook {    //Extends hook class which has setup for driver
//    @Test
//    public void doSearch(String item) {
//        driver.findElement(By.name("searchTerm")).sendKeys(item);
//        driver.findElement(By.className("_2mKaC")).click();
//    }
//
//    @Test
//    public void selectCustomerRating(String customerSelectedRating) {
//        List<WebElement> ratingWebElements = driver.findElements(By.cssSelector(".ac-facet__filters--rating .ac-facet__label"));
//        for (WebElement ratingWebElement : ratingWebElements) {
//            if (ratingWebElement.getText().equalsIgnoreCase(customerSelectedRating)) {
//                ratingWebElement.click();
//                break;
//            }
//        }
//    }
//
//    @Test
//    public List<Double> getAllRatingOnFilteredProduct() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        List<Double> collectedRating = new ArrayList<Double>();
//        List<WebElement> ratingWebElements = driver.findElements(By.cssSelector(".ac-star-rating"));
//        for (WebElement ratingWebElement : ratingWebElements) {
//            String ratingInString = ratingWebElement.getAttribute("data-star-rating");
//            double ratingInDouble = Double.parseDouble(ratingInString);
//            collectedRating.add(ratingInDouble);
//        }
//        return collectedRating;
//
//    }
//
////  @Test
////    public void selectPrice(int min,int max)
////    {
////        List<WebElement> priceWebSelection=driver.findElements(By.cssSelector(".ac-facet__filters.ac-facet__filters--default [name='price']"));
////        // System.out.println(priceWebSelection);     printing list of elements
////        for(WebElement priceWebSelections:priceWebSelection)
//////        {
////            if (priceWebSelections.getText().equals(min) && priceWebSelections.getText().equals(max));
////            priceWebSelections.click();
////            break;
////
////        }
////
////    }
//}
