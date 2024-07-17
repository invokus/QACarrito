package com.example.tasks.web;

import com.example.interactions.Time;
import com.example.userinterfaces.screens.StorePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class StoreCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(StorePage.firstProduct),
                Click.on(StorePage.btnAdd),
                Click.on(StorePage.home),
                Click.on(StorePage.secondtProduct),
                Click.on(StorePage.btnAdd),
                Click.on(StorePage.cart),
                Click.on(StorePage.placeOrder)
        );
    }

    public static StoreCart storeCart(){
        return instrumented(StoreCart.class);
    }
}
