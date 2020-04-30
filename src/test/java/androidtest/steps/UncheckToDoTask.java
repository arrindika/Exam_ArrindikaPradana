package androidtest.steps;

import androidTest.pages.ToDoHomePage;
import androidTest.pages.UncheckToDoPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UncheckToDoTask {

    ToDoHomePage toDoHomePage = new ToDoHomePage();
    UncheckToDoPage uncheckToDoTask = new UncheckToDoPage();

    @When("User click uncheck on To Do {string}")
    public void userClickUncheckOnToDo(String id) {
        uncheckToDoTask.clickUncheck(id);
    }

    @Then("To Do Unchecked")
    public void toDoUnchecked() {
        uncheckToDoTask.checkdone();
    }
}
