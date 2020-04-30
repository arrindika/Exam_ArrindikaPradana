package androidtest.steps;

import androidTest.pages.CreateToDoPage;
import androidTest.pages.ToDoHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateToDoSteps {

    CreateToDoPage createToDoPage = new CreateToDoPage();
    ToDoHomePage toDoHomePage = new ToDoHomePage();

    @Given("User is on create to do list page")
    public void userIsOnCreateToDoListPage() {
        createToDoPage.openHomePage();
    }

    @When("User input title {string} on New To Do Page")
    public void userInputTitleOnNewToDoPage(String title) {
        createToDoPage.inputTitle(title);
    }

    @When("User input to do {string} on New To Do Page")
    public void userInputToDoOnNewToDoPage(String todo) {
        createToDoPage.inputToDo(todo);
    }

    @When("User Click Create To Do on New To Do Page")
    public void userClickCreateToDoOnNewToDoPage() {
        createToDoPage.clickCreate();
    }

    @Then("User back to Home Page")
    public void userBackToHomePage() {
        boolean result = toDoHomePage.isOnPage();
    }


    @Then("Task {string} created")
    public void taskCreated(String tit) {
        String title1 = createToDoPage.checkToDo();
        Assert.assertEquals(tit, title1);
    }
}
