Feature Login And Registration

  Scenario: Register new customer
    Given I am on Healthera app welcome screen
    When I click on continue email option
    Then I should be on next screen with email input text box
    When I Enter email ""
    And  I click on continue button
    Then I should be on personal details screen
    And I should see "" message
    And I enter my personal details
    | First Name | Last Name | DOB            | email           |Password            |
    |   abc      | xyz       | 01/01/1977     | abc@gmail.com   |password123         |
    Then I could see proceed button enabled
    When I click on proceed button
    Then I should be on term and condition screen with confirm button disabled
    When I accept alarms and terms & conditions
    Then Create account button should be enabled
    When I click on create account
    Then I should be on GDPR screen with all selected option with done button
    And  I click on done button
    Then I should see verify your email screen
    And  I see one widget with email ""
    And  I see following options
    |thats not me               |
    |verify email               |
    |resend email again         |

  Scenario: Login with existing customer
    Given I am on Healthera app welcome screen
    When I click on continue email option
    Then I should be on next screen with email input text box
    When I Enter email ""
    And  I click on continue button
    Then I should be on Login screen email id populated
    When I enter password ""
    And  I click on login button
    Then I should be on home page

  Scenario: Login with invalid password
    Given I am on Healthera app welcome screen
    When I click on continue email option
    Then I should be on next screen with email input text box
    When I Enter email ""
    And  I click on continue button
    Then I should be on Login screen email id populated
    When I enter password ""
    And  I click on login button
    Then I could see password is incorrect!

  Scenario: Register new customer with invalid input
    Given I am on Healthera app welcome screen
    When I click on continue email option
    Then I should be on next screen with email input text box
    When I Enter email ""
    And  I click on continue button
    Then I should be on personal details screen
    And  I should see "" message
    And  I enter my personal details
      | First Name | Last Name | DOB               | email           | Password      |
      |   abc      | xyz       | 01/01/02/1977     | abc@gmail.com   | password123   |
    Then I could see error message for DOB field
    And  I could see proceed button disabled
    And  I enter my personal details
      | First Name | Last Name | DOB            | email          | Password      |
      |   abc      | xyz       | 01/01/1977     | abcgmail.com   | password123   |
    Then I could see error message for email field
    And  I could see proceed button disabled
    And  I enter my personal details
      | First Name | Last Name | DOB            | email           | Password |
      |   abc      | xyz       | 01/01/1977     | abc@gmail.com   | passwo   |
    Then I could see error message for password field
    And  I could see proceed button disabled