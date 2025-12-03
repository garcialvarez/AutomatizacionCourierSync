#Author: DanielJose
  #Language: en

Feature: Shipment Creation
  As a user, I want to delete existing shipments so that I can remove completed shipments.

  Scenario: Delete an existing shipment successfully
    Given I am on the shipment page as an administrator
    When I select an existing shipment and choose the delete option
    Then The shipment should be deleted successfully