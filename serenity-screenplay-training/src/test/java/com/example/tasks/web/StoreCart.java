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
                Time.time(5000),
                Click.on(StorePage.btnAdd),
                Time.time(5000),
                Click.on(StorePage.home),
                Time.time(5000),
                Click.on(StorePage.secondtProduct),
                Time.time(5000),
                Click.on(StorePage.btnAdd),
                Time.time(5000),
                Click.on(StorePage.cart),
                Time.time(5000),
                Click.on(StorePage.placeOrder),
                Time.time(5000)
        );
    }

    public static StoreCart storeCart(){
        return instrumented(StoreCart.class);
    }
}
