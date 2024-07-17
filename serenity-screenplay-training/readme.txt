# Product Store Automation
Este proyecto automatiza la compra de productos en una tienda en línea utilizando Serenity BDD, Cucumber y Screenplay.
## Requisitos Previos
- JDK 8 o superior
- Maven 3.6.0 o superior
- Git
## Instalación
1. Clona el repositorio:
    ```bash
    git clone https://github.com/invokus/QACarrito.git
    ```
2. Navega al directorio del proyecto:
    ```bash
    cd serenity-screenplay-training
    ```
3. Compila el proyecto y descarga las dependencias:

    ```bash
    mvn clean install
    ```

## Estructura del Proyecto

- **src/test/resources/features/web/Store.feature**: Ubicación de los archivos Gherkin (.feature).
- **src/test/java/com/example/stepdefinitions/StoreStepDef.java**: Definiciones de los pasos.
- **src/test/java/com/example/tasks/web/NavigateTo.java**: Tareas que realizan las acciones para entrar a la página.
- **src/test/java/com/example/tasks/web/StoreCart.java**: Tareas que realizan las acciones para la seleccion de productos.
- **src/test/java/com/example/tasks/web/Purchase.java**: Tareas que realizan las acciones para el ingreso de datos para el pago.
- **src/test/java/com/example/userinterfaces/screens/StoreConfirmPage.java**: Definiciones de las páginas y elementos para confirmar el pago.
- **src/test/java/com/example/userinterfaces/screens/StorePage.java**: Definiciones de las páginas y elementos para seleccionar los productos.
- **datos.json**: Datos de prueba en formato JSON.

## Datos de Prueba

Los datos de prueba se encuentran en el directorio `datos.json`. Por ejemplo:

### Datos en JSON

Ubicación: `productos.json`

```json
[
  {
    "name": "Juan Peres",
    "country": "Ecuador",
    "city": "Quito",
    "credit_card": "1234-5678-9123-4567",
    "month": "12",
    "year": "2024"
  }
]