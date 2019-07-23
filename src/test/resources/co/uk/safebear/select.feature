
Scenario: Select a tool and view what it is
Given I am logged in successfully
When I select a tool
Then I can view the tools description details are

Scenario Outline: user creates tools
  Given i am logged in successfully
  When I create a tool
  Then i can add the created tool to the list on the website




