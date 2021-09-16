Feature: Title of your feature
  Scenario Outline: Title of your scenario
    Given User launch chrome browser
    When User open "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters username as "<username>" and password as "<password>"
    Then click on login
    
    Examples:
    |username|password|
    |admin@yourstore.com|admin|
    |Ankur345|ajjhj2324|
