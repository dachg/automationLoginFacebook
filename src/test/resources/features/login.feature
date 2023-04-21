Feature: Login to Activo

  @GIM-TC-1 @authentication
  Scenario: Usuario inicia sesión correctamente
    Given Diego es un usuario registrado en activo
    When Diego inicia sesion
    Then el ve la ventana inicial de activo
