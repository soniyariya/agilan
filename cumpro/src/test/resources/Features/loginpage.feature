Feature: test login function

@devTest
  Scenario: check login is successfull using vaild details
    Given hit the url
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page
    
    Examples:
    |username| |password|
    |kr@yopmail.com||Inlink@123|
