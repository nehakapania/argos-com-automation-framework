//package com.automation.testsuite;
//
//import org.hamcrest.Matchers;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import static org.hamcrest.Matchers.everyItem;
//import static org.hamcrest.Matchers.greaterThanOrEqualTo;
//import static org.junit.Assert.assertThat;
//
//public class SmokeTestSuite extends Locators {
//    Locators locate = new Locators();
//
//    @Test
//    public void reviewTest() {
//        doSearch("nike");
//        selectCustomerRating("3or more");
//       // locate.doSearch("nike"); // calling method
//       // locate.selectCustomerRating("3or more"); // calling method
//
//  //  @Test
//  //  public void assertionOfRating() {
//        List<Double> actualList = locate.getAllRatingOnFilteredProduct();
//        assertThat(actualList,everyItem(greaterThanOrEqualTo("3.0")));
//    }
////    selectPrice(25,50);
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
