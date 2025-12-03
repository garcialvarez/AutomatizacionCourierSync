#Author: DanielJose
  #Language: en

Feature: Shipment Creation
  As an administrator, I want to create new shipments so that I can efficiently handle customer orders.

  Scenario: Create new shipment successfully
    Given I am on the shipment tab as an administrator
    When I select create shipment and fill all the required data
    Then The new shipment should be created successfully