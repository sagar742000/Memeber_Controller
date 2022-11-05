Feature: user is able to  retirve the data from database by email and otp
@getemailid
  Scenario: user need to get the data by using email and otp 
    When user is able to get data from database by using url "http://localhost:8080/members/email/sagar132%40gmail.com/otp/0"
    Then User Validate the Statuscode of the Id is 200
