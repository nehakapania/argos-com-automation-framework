@Search
Feature: Search Function
  AS A customer
  I WANT TO search for a product
  SO THAT i can get respective product

  @Smoke
  Scenario: Search for a product
    Given   I am on homepage
    When    I search for a product nike
    Then    I should see nike products

  @Regression
  Scenario Outline: Search Products with valid inputs
    Given  I am on homepage
    When   I search for products "<Products>"
    Then   I should see respective Product
    Examples:
      | Products |
      | puma     |
      | adidas   |