Feature: Product Store

  @Compras
  Scenario Outline: Compras Carrito
    Given que el usuario esta en la pagina principal
    When agrego productos al carrito
    Then verifico que se haya agregado
    And agrego los datos para la compra
    And ingreso <name> <country> <city> <credit_card> <month> <year>

    Examples:
    | name       | country | city  | credit_card         | month | year |
    | Juan Peres | Ecuador | Quito | 1234-5678-9123-4567 | 12    | 2024 |
