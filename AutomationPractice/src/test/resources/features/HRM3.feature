Feature: HRM Application Automation using Cucumber

  Scenario: AddEmployee
    
    When PIM
    When AddEmployee
    When Save
   

  Scenario: EditEmployee
   
    When PIM
    When Search
    When EditEmployee
    

  Scenario: DeleteEmployee
    
    When PIM
    Then Search
    Then DeleteEmployee
    