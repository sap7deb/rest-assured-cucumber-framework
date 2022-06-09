@GET
Feature: To Fetch and validate if the user exists using GET endpoint

  Scenario Outline: This is to validate if the user is fetched using the GET endpoint
    Given User has an valid "<endpoint>"
    When User makes a request for the id 9007
    Then Use validated that the response matched "<responseBody>" with status code 200
    Examples:
      | endpoint         | responseBody     |
      | /public/v2/users | userdetails.json |