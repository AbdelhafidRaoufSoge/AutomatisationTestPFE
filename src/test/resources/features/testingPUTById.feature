Feature: Testing API PUT

  Scenario: Testing Api Put By ID
    Given url 'https://reqres.in/api/users/2'
    And request {"name": "morpheus","job": "zion resident"}
    When method PUT
    Then status 200
    And print response
    And print responseStatus
