Feature: This feature will be used to test the calculator for adding and subtracting

  Background: Test Calculator
    Given I have a calculator

  Scenario: Test for addition of 2 nos
    When I add 7 and 5
    Then I should get the result 12

  Scenario: Test for subtraction of 2 nos
    When I sub 7 and 5
    Then I should get the result 2

  Scenario Outline: Test for addition of 2 nos
    When I add <n1> and <n2>
    Then I should get the result <res>

    Examples: 
      | n1 | n2 | res |
      |  7 |  5 |  12 |

  Scenario Outline: Test for subtraction of 2 nos
    When I sub <x> and <y>
    Then I should get the result <z>

    Examples: 
      | x | y | z |
      | 7 | 5 | 2 |

  Scenario: Add multiple numbers using cucumber data table
    Given I have a calculator
    When I add below numbers
      | 4 |
      | 5 |
      | 7 |
      | 8 |
    Then I should get the result 24

  Scenario: Add multiple numbers using cucumber data table
    Given I have a calculator
    When I add below numbers using List
      |  4 |
      |  5 |
      |  7 |
      |  8 |
      | 10 |
    Then I should get the result 34

  Scenario: To calculate the total bill of the order
    Given I have a calculator
    When I order below items
      | coffee | 23 |
      | tea    | 27 |
    Then I should get the result 50

  Scenario: To calculate the total bill of the order using quantity
    Given I have a calculator
    When I order below items and quantity
      | coffee | 1 | 10 |
      | tea    | 2 | 20 |
      | Burger | 3 | 30 |
    Then I should get the result 140
