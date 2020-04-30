package androidtest.steps;

import androidTest.pages.MoreOptionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class MoreOption {

    MoreOptionPage moreOption = new MoreOptionPage();

    @And("User Click refresh button")
    public void userClickRefreshButton() {
        moreOption.clickRefresh();
    }

    @When("User click more option on Home Page")
    public void userClickMoreOptionOnHomePage() {
        moreOption.clickMoreOption();
    }

    @And("User Click clear button")
    public void userClickClearButton() {
        moreOption.clickClear();
    }
}
