Feature Login And Registration

  Scenario: Register new customer
    Given I am on Healthera app welcome screen
    When I click on continue email option
    Then I should be on next screen with email input text box
    When I Enter email abc@gmail.com
    And  I click on continue button
    Then I should be on personal details screen
    And I should see Your Personal Details message
    And I enter my personal details
    | First Name | Last Name | DOB            | Email           |Password            |
    |   abc      | xyz       | 01/01/1977     | abc@gmail.com   |password123         |
    Then I should see proceed button enabled
    When I click on proceed button
    Then I should be on term and condition screen with confirm button disabled
    When I accept product concent and terms & conditions
    Then Create account button should be enabled
    When I click on create account
    Then I should be on GDPR screen with all option selected and done selected
    And  I click on done button
    Then I should see verify your email screen
    And  I see my email abc@gmail.com

  Scenario: Login with existing customer
    Given I am on Healthera app welcome screen
    When I click on continue email option
    Then I should be on next screen with email input text box
    When I Enter email abc@gmail.com
    And  I click on continue button
    Then I should be on Login screen with abc@gmail.com email id populated
    When I enter password password123
    And  I click on login button
    Then I should be on home page

  Scenario: Login with invalid password
    Given I am on Healthera app welcome screen
    When I click on continue email option
    Then I should be on next screen with email input text box
    When I Enter email abc@gmail.com
    And  I click on continue button
    Then I should be on Login screen with abc@gmail.com email id populated
    When I enter password Padsssword23
    And  I click on login button
    Then I should see error message password is incorrect! for password field

  Scenario: Register new customer with invalid input
    Given I am on Healthera app welcome screen
    When I click on continue email option
    Then I should be on next screen with email input text box
    When I Enter email abcasd@gmail.com
    And  I click on continue button
    Then I should be on personal details screen
    And  I should see Your Personal Details message
    And  I enter my personal details
      | First Name | Last Name | DOB               | email           | Password      |
      |   abc      | xyz       | 01/01/02/1977     | abcasd@gmail.com   | password123   |
    Then I should see error message Date of birth is incorrect for DOB field
    And  I could see proceed button disabled
    And I clear all fields
    And  I enter my personal details
      | First Name | Last Name | DOB            | email          | Password      |
      |   abc      | xyz       | 01/01/1977     | abcgmail.com   | password123   |
    Then I should see error message Invalid e-mail address for DOB field
    And  I could see proceed button disabled
    And I clear all fields
    And  I enter my personal details
      | First Name | Last Name | DOB            | email           | Password |
      |   abc      | xyz       | 01/01/1977     | abcasd@gmail.com   |    |
    Then I should see error message Password required for password field
    And  I could see proceed button disabled