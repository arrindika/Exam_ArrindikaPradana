package webtest.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import webTest.pages.HomePage;
import webTest.pages.WikipediaPage;

public class SearchPokemonSteps {

    HomePage homePage = new HomePage();
    WikipediaPage wikipediaPage = new WikipediaPage();

    @Given("User open Google home page")
    public void userOpenGoogleHomePage() {
        homePage.openHomePage();
    }

    @When("User input search {string} on home page")
    public void userInputSearchOnHomePage(String keyword) {
        homePage.inputSearch(keyword);
    }

    @And("User click button search on home page")
    public void userClickButtonSearchOnHomePage() {
        homePage.clickSearch();
    }

    @When("User click first result on page")
    public void userClickFirstResultOnPage() {
        homePage.clickFirstResult();
    }

    @Then("User see article with title {string} on article page")
    public void userSeeArticleWithTitleOnArticlePage(String title) {
        String title1 = wikipediaPage.getTitle();
        Assert.assertEquals(title, title1);
    }

    @And("User see article with number {string} on article page")
    public void userSeeArticleWithNumberOnArticlePage(String number) {
        String title1 = wikipediaPage.getNumber();
        Assert.assertEquals(number, title1);
    }
}
