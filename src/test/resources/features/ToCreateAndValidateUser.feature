@POST
Feature: To create and validate the user using POST endpoint

  Scenario Outline: This is to validate if the user is created using the POST endpoint
    Given User has an valid "<endpoint>"
    When User makes a request with "<requestBody>"
    Then User validated that the response with status code
      | name   | Tarshi Lewis            |
      | email  | tarshi_lewis11@abcd.com |
      | gender | male                    |
      | status | active                  |
    And User validates the response code as 201
    Examples:
      | endpoint         | requestBody      |
      | /public/v2/users | userdetails.json |