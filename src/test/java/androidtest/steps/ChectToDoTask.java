package androidtest.steps;

import androidTest.pages.CheckToDoPage;
import androidTest.pages.ToDoHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChectToDoTask {

    ToDoHomePage toDoHomePage = new ToDoHomePage();
    CheckToDoPage checkToDoPage = new CheckToDoPage();

    @Given("User is on HomePage")
    public void userIsOnHomePage() {
        boolean result = toDoHomePage.isOnPage();
    }

    @When("User click complete on To Do {string}")
    public void userClickCompleteOnToDo(String id) {
        checkToDoPage.clickCheck(id);
    }

    @Then("To Do Completed")
    public void toDoCompleted() {
        checkToDoPage.checkdone();
    }
}
