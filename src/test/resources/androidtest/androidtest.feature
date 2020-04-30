@Android
Feature: Create To Do Task
  @Create
  Scenario: Create To Do Task 1
    Given User is on create to do list page
    When User input title "Title 1" on New To Do Page
    And User input to do "To Do 1" on New To Do Page
    And User Click Create To Do on New To Do Page
    Then Task "Title 1" created

  @Check
  Scenario: Check To Do Task 1
    Given User is on create to do list page
    When User input title "Title 1" on New To Do Page
    And User input to do "To Do 1" on New To Do Page
    And User Click Create To Do on New To Do Page
    Then User back to Home Page
    When User click complete on To Do "1"
    Then To Do Completed

  @Uncheck
  Scenario: UnCheck To Do Task 1
    Given User is on create to do list page
    When User input title "Title 1" on New To Do Page
    And User input to do "To Do 1" on New To Do Page
    And User Click Create To Do on New To Do Page
    Then User back to Home Page
    When User click complete on To Do "1"
    Then To Do Completed
    When User click uncheck on To Do "1"
    Then To Do Unchecked

  @FilterActive
  Scenario: Filter Active To Do Only
    Given User is on create to do list page
    When User input title "Title 1" on New To Do Page
    And User input to do "To Do 1" on New To Do Page
    And User Click Create To Do on New To Do Page
    Then User back to Home Page
    Given User is on create to do list page
    When User input title "Title 2" on New To Do Page
    And User input to do "To Do 2" on New To Do Page
    And User Click Create To Do on New To Do Page
    Then User back to Home Page
    When User click complete on To Do "1"
    Then To Do Completed
    When User click filter button
    And User click Active To Do Filter
    Then Just Active Filter is view

  @FilterComplete
  Scenario: Filter Complete To Do Only
    Given User is on create to do list page
    When User input title "Title 1" on New To Do Page
    And User input to do "To Do 1" on New To Do Page
    And User Click Create To Do on New To Do Page
    Then User back to Home Page
    Given User is on create to do list page
    When User input title "Title 2" on New To Do Page
    And User input to do "To Do 2" on New To Do Page
    And User Click Create To Do on New To Do Page
    Then User back to Home Page
    When User click complete on To Do "1"
    Then To Do Completed
    When User click filter button
    And User click Complete To Do Filter
    Then Just Active Filter is view

  @Refresh
  Scenario: Refresh Page
    Given User is on create to do list page
    When User input title "Title 1" on New To Do Page
    And User input to do "To Do 1" on New To Do Page
    And User Click Create To Do on New To Do Page
    Then User back to Home Page
    When User click more option on Home Page
    And User Click refresh button
    Then User back to Home Page

  @ClearToDo
  Scenario: Clear Page
    Given User is on create to do list page
    When User input title "Title 1" on New To Do Page
    And User input to do "To Do 1" on New To Do Page
    And User Click Create To Do on New To Do Page
    Then User back to Home Page
    When User click complete on To Do "1"
    When User click more option on Home Page
    And User Click clear button
    Then User back to Home Page

  @CheckStatistic
  Scenario: Filter Active To Do Only
    Given User is on create to do list page
    When User input title "Title 1" on New To Do Page
    And User input to do "To Do 1" on New To Do Page
    And User Click Create To Do on New To Do Page
    Then User back to Home Page
    When User click menu on Home Page
    And User click statistics
    Then User on Statistics Page


