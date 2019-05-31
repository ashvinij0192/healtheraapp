Feature: Medicines

  Scenario: Add new medicine
    Given I am on Healthera app welcome screen
    When I click on continue email option
    Then I should be on next screen with email input text box
    When I Enter email abc@gmail.com
    And  I click on continue button
    Then I should be on Login screen with abc@gmail.com email id populated
    When I enter password password@123
    And  I click on login button
    Then I should be on home page
    When I click on medicines option
    Then I should be on medicines screen
    And I see add medicine button enabled
    When I click on add medicine button
    Then I should be on who is this for? screen with option my self and add a dependent
    When I click on myself
    Then I should be on add medicine screen
    #And I see following option
    #|search medicine| scan barcode or medicine pacakage|scan smart prescription label|
    When I enter Brufen 200mg tablets
    And I click on search button
    Then I see When will you run out of screen with following details
    | in 28 days  | in 56 days | in 90 days|Choose Date|
    And I see default 28 days option selected
    When I click on proceed button
    Then I should be on alarm schedule screen with following options
    |WHICH DAYS ARE YOU TAKING THE MEDICINE?|HOW MANY ALARMS TO GO OFF A DAY?|TIME AND QUANTITY|
    |Daily                                  |1                               |08:00 AM (take 1)|
    When I click on proceed button
    Then I see You have added Brufen 200mg tablets to your cabinet message
    When I click on proceed button
    Then I should be on medicines screen
    #And I see Brufen 200mg tablets into my medicine list

    Scenario: Edit existing medicine
      Given I am on Healthera app welcome screen
      When I click on continue email option
      Then I should be on next screen with email input text box
      When I Enter email abc@gmail.com
      And  I click on continue button
      Then I should be on Login screen with abc@gmail.com email id populated
      When I enter password password@123
      And  I click on login button
      Then I should be on home page
      When I click on medicines option
      Then I should be on medicines screen
      #And I see following options
      #|Alarm schedule|Calender|Notes|Receive reminder to refill|date to run out|
      #When I click on alarm schedule option
      #Then I should be on alarm schedule screen with following options
      #  |WHICH DAYS ARE YOU TAKING THE MEDICINE?|HOW MANY ALARMS TO GO OFF A DAY?|TIME AND QUANTITY|
      #  |Daily                                  |1                               |08:00 AM (take 1)|
      #When I click on WHICH DAYS ARE YOU TAKING THE MEDICINE option
      #Then I see How often is this dose taken pop up
      #And I choose Every Other Day option
      #And I click on Save button
      #Then I should be on medicine details screen


