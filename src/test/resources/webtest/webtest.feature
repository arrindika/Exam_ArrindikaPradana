@Web
Feature: Search Google

  Scenario: Search article about Pikachu on Google
    Given User open Google home page
    When User input search "Pikachu Wikipedia Indonesia" on home page
    And User click button search on home page
    When User click first result on page
    Then User see article with title "Pikachu" on article page
    And User see article with number "025" on article page

  Scenario: Search article about Charizard on Google
    Given User open Google home page
    When User input search "Charizard Wikipedia Indonesia" on home page
    And User click button search on home page
    When User click first result on page
    Then User see article with title "Charizard" on article page
    And User see article with number "006" on article page

  Scenario: Search article about Bulbasaur on Google
    Given User open Google home page
    When User input search "Bulbasaur Wikipedia Indonesia" on home page
    And User click button search on home page
    When User click first result on page
    Then User see article with title "Bulbasaur" on article page
    And User see article with number "001" on article page

  Scenario: Search article about Mewtwo on Google
    Given User open Google home page
    When User input search "Mewtwo Wikipedia Indonesia" on home page
    And User click button search on home page
    When User click first result on page
    Then User see article with title "Mewtwo" on article page
    And User see article with number "150" on article page
