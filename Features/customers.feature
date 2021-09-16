Feature: To Test Customer Related Services

Scenario: Add a new customer
    Given User launch chrome browser
    When User open "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters username as "admin@yourstore.com" and password as "admin"
    And click on login
    Then user can view dashboard
    When user click on customer menu item
    And click on customers option
    And click on add new option
    Then user can view add new customer page
    When user enters customer info
    And click on save button
    
