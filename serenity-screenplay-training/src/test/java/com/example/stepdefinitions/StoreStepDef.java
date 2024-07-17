package com.example.stepdefinitions;

import com.example.tasks.web.NavigateTo;
import com.example.tasks.web.Purchase;
import com.example.tasks.web.StoreCart;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StoreStepDef {

    private Scenario scenario;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Before(order = 1)
    public void setScenario (Scenario scenario){
        this.scenario = scenario;
    }

    @Given("^que el (.*) esta en la pagina principal")
    public void queElUsuarioEstaEnLaPaginaPrincipal(String actor) {
        theActorCalled(actor).attemptsTo(
                NavigateTo.store()
        );
    }

    @When("agrego productos al carrito")
    public void agregoProductosAlCarrito() {
        theActorInTheSpotlight().attemptsTo(
                StoreCart.storeCart()
        );
    }

    @Then("verifico que se haya agregado")
    public void verificoQueSeHayaAgregado() {
    }

    @And("agrego los datos para la compra")
    public void agregoLosDatosParaLaCompra() {
    }

    @And("^ingreso (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void form(
            String name, String country, String city, String creditCard, String month, String year) {
        theActorInTheSpotlight().attemptsTo(
                Purchase.withData(name, country, city, creditCard, month, year));
    }
}
