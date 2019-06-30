@Price
Feature: price
  AS AN end User
  I WANT TO select the price of products
  SO THAT i can see products of my choice

  @Smoke
  Scenario: Select and  sort the price of products
    Given    I am on homepage
    When     I search for a product "nike"
    And      I select price filter
    Then     I should see respective Product of my choice

