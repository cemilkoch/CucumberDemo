Feature: FizzBuzz Game

  Scenario: Play FizzBuzz to get Fizz
    Given Create a FizzBuzz game
    When I play with number 3
    Then I expect "Fizz"