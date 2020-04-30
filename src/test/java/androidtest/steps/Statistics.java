package androidtest.steps;

import androidTest.pages.StatisticsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Statistics {
    StatisticsPage statisticsPage = new StatisticsPage();

    @When("User click menu on Home Page")
    public void userClickMenuOnHomePage() {
        statisticsPage.clickMenu();
    }

    @And("User click statistics")
    public void userClickStatistics() {
        statisticsPage.clickStatistic();
    }

    @Then("User on Statistics Page")
    public void userOnStatisticsPage() {
        boolean result = statisticsPage.isOnPage();
    }
}
