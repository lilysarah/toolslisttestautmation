Feature: create
  Add a tool to the list

  Scenario Outline: user creates tools
    Given i am logged in successfully
    When I create a tool "<use>" and "<name>"
    Then i can add the created tool to the list on the website
    Examples:
      | use         | name   |
      | sstool      | ssayer |
      | anothertool | ssayer |







