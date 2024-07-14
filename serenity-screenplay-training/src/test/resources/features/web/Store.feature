Feature: Product Store

  @Compras
  Scenario: Compras Carrito
    Given que el usuario esta en la pagina principal
    When agrego productos al carrito
    Then verifico que se haya agregado
    And agrego los datos para la compra