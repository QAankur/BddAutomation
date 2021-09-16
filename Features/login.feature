Feature: Title of your feature
  Scenario: Title of your scenario
    Given User launch chrome browser
    When User open "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters username as "admin@yourstore.com" and password as "admin"
    Then click on login