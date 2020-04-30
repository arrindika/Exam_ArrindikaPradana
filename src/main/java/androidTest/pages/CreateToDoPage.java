package androidTest.pages;

import androidTest.driver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateToDoPage {
    public void openHomePage(){
        WebElement openPage = AndroidDriverInstance.androidDriver.findElement(By.id("fab_add_task"));
        openPage.click();
    }
    public void inputTitle(String title){
        WebElement inputtitle = AndroidDriverInstance.androidDriver.findElement(By.id("add_task_title"));
        inputtitle.sendKeys(title);
    }

    public void inputToDo(String todo){
        WebElement inputtodo = AndroidDriverInstance.androidDriver.findElement(By.id("add_task_description"));
        inputtodo.sendKeys(todo);
    }

    public void clickCreate(){
        WebElement buttonSearch = AndroidDriverInstance.androidDriver.findElement(By.id("fab_edit_task_done"));
        buttonSearch.click();
    }
    public String checkToDo(){
        WebElement search = AndroidDriverInstance.androidDriver.findElement(By.id("title"));
        String title = search.getText();
        return title;
    }
}
