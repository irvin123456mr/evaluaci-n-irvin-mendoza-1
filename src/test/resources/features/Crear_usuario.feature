Feature: Crear usuario.PetStore
@testl
  Scenario: Crear usuario

    When creo el usuario con username "irvinmendoza",firstname "irvin",lastname "mendoza"
    Then el código de respuesta es 200
    And el type es "unknown"