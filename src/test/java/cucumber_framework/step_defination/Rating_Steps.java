package cucumber_framework.step_defination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber_framework.pageObject.HomePage;
import cucumber_framework.pageObject.ResultPage;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Every.everyItem;

public class Rating_Steps {
   private HomePage homePage = new HomePage();
   private ResultPage resultPage = new ResultPage();

    @When("^I select a rating$")
    public void i_select_a_rating()
    {
      resultPage.selectARating("3or more");


    }

    @Then("^I should see products according to selected rating$")
    public void i_should_see_products_according_to_selected_rating()  {
        List<Double> actualRating=resultPage.verifyRatingOnProducts();
        assertThat(actualRating,Matchers.everyItem(greaterThan(3.0)));
        System.out.println("every item is above 3.0");
    }


    @When("^I select a rating with filter \"([^\"]*)\"$")
    public void i_select_a_rating_with_filter(String filters)
    {
       resultPage.selectARating(filters);
    }



//    @Given("^I am on Search Result Page$")
//    public void i_am_on_Search_Result_Page()
//    {
//        homePage.doSearch("nike");
//        String actualResultPage = homePage.getHomepageUrl();
//        assertThat(actualResultPage, containsString("/search"));
//    }
//
//    @When("^I select a rating$")
//    public void i_select_a_rating()
//    {
//        resultPage.selectARating("4or more");
//        resultPage.selectARating(resultPage.expectedCustomerRating);
//    }
//
//    @Then("^I should see products in rating range$")
//    public void i_should_see_products_in_rating_range()
//    {
//        List<Double> actualProductRating = resultPage.checkProductsRating();
//        // System.out.println(actualProductRating);
//        assertThat(actualProductRating, everyItem(Matchers.greaterThanOrEqualTo(4.0)));
//        System.out.println("Every item is greater than 4.0");
//    }
//
}
