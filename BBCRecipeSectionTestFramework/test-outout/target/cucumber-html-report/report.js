$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ARSHO/eclipse-workspace/LoginTestCucumberFramework/src/main/java/Features/recipe.feature");
formatter.feature({
  "line": 1,
  "name": "Recipe Section",
  "description": "\tAs a user\r\n    I want to navigate to the recipe section",
  "id": "recipe-section",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Open Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I am on the home page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I hover over Recipe link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Healthy dinner",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Healthy dinner page open",
  "keyword": "And "
});
formatter.match({
  "location": "BBCFoodRecipeStepDefinition.open_Chrome_and_launch_the_application()"
});
formatter.result({
  "duration": 15078967332,
  "status": "passed"
});
formatter.match({
  "location": "BBCFoodRecipeStepDefinition.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 35673080,
  "status": "passed"
});
formatter.match({
  "location": "BBCFoodRecipeStepDefinition.i_hover_over_Recipe_link()"
});
formatter.result({
  "duration": 2903753540,
  "status": "passed"
});
formatter.match({
  "location": "BBCFoodRecipeStepDefinition.i_click_on_Healthy_dinner()"
});
formatter.result({
  "duration": 183150551,
  "status": "passed"
});
formatter.match({
  "location": "BBCFoodRecipeStepDefinition.healthy_dinner_page_open()"
});
formatter.result({
  "duration": 6265184825,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 13,
      "value": "#   Scenario: User clicks recipe link"
    },
    {
      "line": 14,
      "value": "#    Then click Spanish chicken stew text"
    },
    {
      "line": 15,
      "value": "#    And I land on Spanish chicken stew recipe page"
    },
    {
      "line": 16,
      "value": "#    And Close browser"
    },
    {
      "line": 17,
      "value": "#"
    },
    {
      "line": 18,
      "value": "#  Scenario: User clicks recipe image"
    },
    {
      "line": 19,
      "value": "#    Then click on Tandoori trout"
    },
    {
      "line": 20,
      "value": "#\tAnd land on Tandoori trout recipe page"
    },
    {
      "line": 21,
      "value": "#    And Close browser"
    }
  ],
  "line": 23,
  "name": "broken link",
  "description": "",
  "id": "recipe-section;broken-link",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "look for broken link",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "exit browser",
  "keyword": "And "
});
formatter.match({
  "location": "BBCFoodRecipeStepDefinition.look_for_broken_link()"
});
formatter.result({
  "duration": 110527551159,
  "status": "passed"
});
formatter.match({
  "location": "BBCFoodRecipeStepDefinition.exit_browser()"
});
formatter.result({
  "duration": 2159893623,
  "status": "passed"
});
});