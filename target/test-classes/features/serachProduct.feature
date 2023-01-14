
@tag
Feature: Search and Place the order for Products

  @tag1
  Scenario: Search Experience both home and offers page
    Given User is on GreenCart Lading Page
    When user searched with short name "Tom" and extracted actual name of product
    Then user serached for same shortname in offers page to check if product exist

 