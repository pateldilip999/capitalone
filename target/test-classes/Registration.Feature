Feature:
  Scenario: page varifiaction
#    Given I enter url as "https://www.capitalone.co.uk/"
    When I click on Quick check out now
    Then I should see text "about You"
    And I should see textas "Work & finances"
    And I should see texta "where you live"
    And I should see url as "https://www.capitalone.co.uk/creditcards/secure/find-my-card.jsf"

#   Scenario: about you
    When I clik title as "Miss"
    Given I enter firstname as "Mahesh"
    Given I enter lastname as "raja"
    And I enter email as "email@email.com"
    And I enter date of birth

#     Scenario: Work_finance

    When I click on employment status
    Given I enter occupation
    Given I enter yearly income
    When I click on yes button

#    Scenario: where you live

      When I click on resident as "Homeowner"
      When I click on years of address "5"
      Given I enter house number as "115"
      Given I enter postcode as "HA8 5PX"
#      When I click on find address
#      When I click on confirm address

#    Scenario: Enter address manual

      When I click on manual address button
      Given I enter flat number as "flat A"
      Given I enter House name as "Krishna home"
      Given I enter housenumber as "114"
      Given I enter street name as "Reynolds drive"
      Given I enter addressline as "edgware"
      Given I enter town as "london"
      Given I enter county as "Middlessex"
      Given I enter postcod as "HA8 5PX"

      When I click on checkbox noworris
      When I click on checkbox sms
      When I click on checknow button










