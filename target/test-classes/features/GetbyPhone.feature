Feature: user is able to get the data from database

  Scenario: user wants to get the data from database by using phone number
    When user should be able to get the data by using an url is "http://localhost:8080/members/phone/0"
    Then user validates the status code of the id is 200
