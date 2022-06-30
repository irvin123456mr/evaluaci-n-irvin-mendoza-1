Feature: Crear Examen.examen
@testl
  Scenario: caso examen valores

    When creo los valores con Id "45335136",title "evaluacion"
    Then el código de respuesta es 200
    And el type es "unknown"