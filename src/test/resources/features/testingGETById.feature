Feature: Testing API GETById

  Scenario: Testing Api Get One User

    Given url 'https://reqres.in/api/users/2'
    When method GET
    Then status 200

    And print response
    And print responseStatus
    And print responseTime
