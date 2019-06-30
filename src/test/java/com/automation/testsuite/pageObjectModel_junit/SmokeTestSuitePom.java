package com.automation.testsuite.pageObjectModel_junit;

import com.automation.testsuite.pageObjectModel_junit.page_model.HomePage;
import com.automation.testsuite.pageObjectModel_junit.page_model.ResultPage;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Every.everyItem;

public class SmokeTestSuitePom extends Hooks {
    private HomePage homepage = new HomePage();
    private ResultPage resultPage = new ResultPage();


    @Test
    public void runTest() {

        homepage.doSearch("nike");
        resultPage.searchAResult("nike");

    }

    @Test
    public void reviewTest()
    {
        homepage.doSearch("nike");
        resultPage.selectARating("3or more");
        List<Double> actualRating= resultPage.collectCustomerRating();
        assertThat(actualRating,everyItem(Matchers.greaterThanOrEqualTo(3.0)));
    }
    @Test
    public void priceTest()
    {
        homepage.doSearch("nike");
        resultPage.selectAPrice("£15 - £20");
        System.out.println("Search Test Passed");
        List<Double> actualList= resultPage.selectedCustomerPrice();
        assertThat(actualList,everyItem(Matchers.greaterThanOrEqualTo(15.0)));
        assertThat(actualList,everyItem(Matchers.lessThanOrEqualTo(20.0)));
        System.out.println("every item is less than 20 and more than 15");
    }


    @Test
    public void addToTrolley()
    {
        homepage.doSearch("nike");
        resultPage.selectAPrice("£20 - £25");
        String actualProduct= resultPage.selectAProduct();
        //System.out.println("ActualProduct is"+actualProduct);
      // driver.findElement(By.cssSelector(".add-to-trolley-main .add-to-trolley-button")).click();//Add to Trolley
      //  driver.findElement(By.cssSelector(".add-to-trolley-modal__cta .sm-block")).click();//Go to Trolley
       // assertThat(Matchers.contains(actualProduct);
        List<String> expected= resultPage.getProductNamesOfAllProducts();
        System.out.println(expected);
        assertThat(expected,contains(actualProduct));
        System.out.println("Yes expected=actual");
      // String expected=driver.findElement(By.cssSelector(".xsHidden.lgBlock .ProductCard__titleLink__1PgaZ")).getText();
        //System.out.println("Expected Product is"+expected);
       // assertThat(actualProduct,is(equalTo(expected)));
      //  System.out.println("expected equals actual");
    }


}
