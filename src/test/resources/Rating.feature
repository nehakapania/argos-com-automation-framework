@Rating
Feature:  Customer Rating Review
  AS AN end User
  I WANT TO Select Product Rating
  SO THAT i can see respective products of the selected rating

  @Smoke @e2e
  Scenario: Select a rating
    Given  I am on homepage
    When   I search for a product nike
    And    I select a rating
    Then   I should see products according to selected rating

    @Regression
    Scenario Outline: Select a rating
      Given I am on homepage
      When  I search for a product nike
      And   I select a rating with filter "<ratingFilter>"
      Then  I should see products according to selected rating
      Examples:
      |ratingFilter|
      |5only       |
      |4or more    |
      |3or more    |
      |2or more    |
      |1or more    |