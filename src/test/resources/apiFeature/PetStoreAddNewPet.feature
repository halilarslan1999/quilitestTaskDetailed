Feature: Add new pet and verify the body

  @wip1
  Scenario Outline: Adding New Pet to PetStore and verifying the body with Hamcrest Method1

    Given User creates a POST request with "<id>" and "<name>"
    Then Verify that status code should be 200 and body must contains "<name>" and <id>

    Examples:
      | id | name        |
      | 20 | Mustermann  |
      | 21 | Blackdoggie |
      | 22 | Whitedog    |
      | 23 | Kling       |


  @wip2
  Scenario Outline: Adding New Pet to PetStore and verifying the body with path Method2
    Given User creates a POST request with "<id>" and "<name>" and "<status>"
    And Then verify that status code is 200
    Then Verify that if body contains "<id>" and "<name>" and "<status>"

    Examples:
      | id | name      | status    |
      | 24 | OrangeDog | available |
      | 25 | BrownDog  | available |
      | 26 | Kinsman   | available |
      | 27 | Andromeda | available |

  @wip3
  Scenario Outline: Adding New Pet to PetStore and verifying the body with JsonPath Method3
    Given User creates a POST request with "<id>" and "<name>" and "<status>"
    And Then verify that status code is 200
    Then Verify with JsonPath that if body contains "<id>" and "<name>" and "<status>"

    Examples:
      | id | name  | status    |
      | 28 | Bunny | available |
      | 29 | Sunny | available |

  @wip4
  Scenario Outline: Adding New Pet to PetStore and verifying the body with Pojo

    Given Create a POST request with <id> and "<name>"
    And Verify the status code
    Then Verify that body contains "<id>" and "<name>"

    Examples:
      | id | name       |
      | 30 | Mustermann |
      | 31 | Conny      |
      | 32 | Pepsi      |
      | 33 | Cola       |