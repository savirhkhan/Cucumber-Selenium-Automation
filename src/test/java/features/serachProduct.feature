
@tag
Feature: Search and Place the order for Products

  @tag1
  Scenario Outline: Search Experience both home and offers page
    Given User is on GreenCart Lading Page
    When user searched with short name <product> and extracted actual name of product
    Then user serached for <product> shortname in offers page to check if product exist
    And validate product name matches with landing page
    Examples:
    |product|
    |Tom    |
    |Stra   |

 