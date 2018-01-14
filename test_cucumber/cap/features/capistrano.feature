Feature: Capistrano hello world

  Scenario: Say hello world with Capistrano
    When I run "cap production notify"
    Then I should see the output "hello local"

