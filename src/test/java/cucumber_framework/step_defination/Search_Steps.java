package cucumber_framework.step_defination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber_framework.pageObject.HomePage;
import cucumber_framework.pageObject.ResultPage;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Every.everyItem;

public class Search_Steps
{
   private HomePage homePage=new HomePage();
   private ResultPage resultPage=new ResultPage();

    @Given("^I am on homepage$")
    public  void i_Am_On_Homepage()
    {
      String actualUrl=homePage.getHomepageUrl();
      assertThat("Your reason"+"Customer is on some other URL",actualUrl,is(endsWith("co.uk/")));
    }

    @When("^I search for a product nike$")
    public void i_search_for_a_product_nike()
    {
       homePage.doSearch("nike");

    }

    @Then("^I should see nike products$")
    public void i_should_see_nike_products()
    {
     String actualHeaderName= resultPage.searchHeaderName();
     assertThat("Customer is getting some different results",actualHeaderName,equalToIgnoringCase("nike"));
    }

    @When("^I search for products \"([^\"]*)\"$")
    public void i_search_for_products(String item)
    {
       homePage.doSearch(item);

    }

    @Then("^I should see respective Product$")
    public void i_should_see_respective_Product()
    {
        String actualHeaderName= resultPage.searchHeaderName();
        assertThat(actualHeaderName,is(equalToIgnoringCase(homePage.searchedProduct)));

    }



}

