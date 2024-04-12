Feature: Testing API POST

  Scenario: Testing Api Post New User
    Given url 'https://reqres.in/api/users'
    And request { "name": "morpheus","job": "leader", "id": "69", "createdAt": "2024-04-12T10:12:34.056Z"}
    When method POST
    Then status 201
    And print response
    And print responseStatus
    And print responseTime
