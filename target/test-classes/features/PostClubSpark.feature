 Feature: user is able to post the data in the database
 Scenario: user wants to post the data
 Given user is able to provide the data
 When user gives a data by using an url is "http://localhost:8080/members"
 Then user validates statuscode is 201
 




