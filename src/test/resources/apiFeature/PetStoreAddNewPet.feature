Feature: Post Add new pet

  @wip
  Scenario Outline: Adding New Pet to PetStore

    Given User creates a POST request with "<id>" and "<name>"
    Then Verify that status code should be 200 and body must contains "<name>" and <id>

    Examples:
      | id | name        |
      | 20 | Mustermann  |
      | 21 | Blackdoggie |
      | 22 | Whitedog    |
      | 22 | Kling       |




