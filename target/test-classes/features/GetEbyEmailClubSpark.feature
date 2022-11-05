Feature: user is able to retrive the data by using Email
@getEmailClub
  Scenario: user need to retrive the data from database by using EmailID
    When user is able to retrive the data by using an url is "http://localhost:8080/members/email/seenu%40gmail.com"
    Then user validate the user  retrive status code of the id is 200
