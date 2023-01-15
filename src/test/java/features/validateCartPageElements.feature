@tag
Feature: Add product to cart and validate the cart page elements
  
  @validateCart
  Scenario Outline: Add product to cart and validate the same product in cart page
    Given User is on GreenCart Lading Page
    When user searched with short name<product>and Add three product to cart
    Then varify same product is added to cart and apply and place Order button displayed
    Examples:
    |product|
    |Tom    |
    |Stra   |
    