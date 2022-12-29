@Search-car
Feature: To test the search car functionality in the carsGuide website

  @Search-cars-positive
  Scenario: to verify search car functionality
    Given user should be on the homepage "https://www.carsguide.com.au/" of cars guide website
    When user hover  menu
      | menu          |
      | buy+sell      |
      | reviews       |
      | news          |
      | advice        |
      | pricing+specs |
      | guides        |
    And click the "Search Cars" link
    
    And user select the make as "BMW"
    And user select the model as "1 Series"
    And user selet the location as "SA - Eyre Peninsula"
    And user select the pricemax value as "$50,000"
    And click the find my next car button
    Then user can see list of searched cars
    And user verify page title should be "Bmw 1 Series Under 50000 for Sale Eyre Peninsula SA | carsguide"
