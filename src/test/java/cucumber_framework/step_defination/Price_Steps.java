package cucumber_framework.step_defination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber_framework.pageObject.HomePage;
import cucumber_framework.pageObject.ResultPage;

public class Price_Steps
{
    private HomePage homePage=new HomePage();
    private ResultPage resultPage=new ResultPage();

    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String arg1)
    {
        homePage.doSearch(arg1);
    }

    @When("^I select price filter$")
    public void i_select_price_filter()
    {
       resultPage.selectAPrice("£20 - £25");
    }

    @Then("^I should see respective Product of my choice$")
    public void i_should_see_respective_Product_of_my_choice() {

    }


}
