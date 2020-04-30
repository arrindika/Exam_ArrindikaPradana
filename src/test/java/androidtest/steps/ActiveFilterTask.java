package androidtest.steps;

import androidTest.pages.FilterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActiveFilterTask {

    FilterPage filterPage = new FilterPage();

    @When("User click filter button")
    public void userClickFilterButton() {

        filterPage.openFilterPage();
    }

    @And("User click Active To Do Filter")
    public void userClickActiveToDoFilter() {
        filterPage.activeFilter();
    }

    @Then("Just Active Filter is view")
    public void justActiveFilterIsView() {
    }

    @And("User click Complete To Do Filter")
    public void userClickCompleteToDoFilter() {
        filterPage.completeFilter();
    }
}
