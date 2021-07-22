#Author: dianacaro46@gmail.com

Feature: User Management

  Scenario Outline: Successful Sing Up a new user in Demo Blaze
  	Given I want create that does not exist
    When I sing Up with valid information "<user>" and "<password>"
    And I confirm the registration
    Then I validate the User is registered
    
    Examples:
      | user  	   | password |
      | User021370 | 123456   |
      | User021371 | 123456   |
  
  Scenario: Successful LogIn an existing user 
  	Given I want LogIn in DemoBlaza with existing user
    When I LogIn with valid information user and password
    And I confirm the LogIn
    Then BlazaDemo welcomes the user
        
	Scenario: Contact record fo user without login
		Given I want record contact user
    When register contact with valid information
    And I confirm Send message
    Then Show the message Thanks for the message
    

        
