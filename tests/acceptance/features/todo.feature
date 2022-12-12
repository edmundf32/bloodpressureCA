Feature: todo
  As a user
  I want to enter my systolic and dystolic pressures
  So that I can find out my blood pressure rating

  Scenario: Calculate my blood pressure
    Given a user has navigated to the homepage
    When the user adds their systolic and dystolic and clicks calculate
    Then their bloodpressure should be displayed