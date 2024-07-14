package com.example.tasks.web;

import com.example.interactions.Time;
import com.example.userinterfaces.screens.StoreConfirmPage;
import com.example.userinterfaces.screens.StorePage;
import com.example.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Purchase implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(Datos.name).into(StoreConfirmPage.name),
                Enter.theValue(Datos.country).into(StoreConfirmPage.country),
                Enter.theValue(Datos.city).into(StoreConfirmPage.city),
                Enter.theValue(Datos.credit_card).into(StoreConfirmPage.creditCard),
                Enter.theValue(Datos.month).into(StoreConfirmPage.month),
                Enter.theValue(Datos.year).into(StoreConfirmPage.year),
                Click.on(StoreConfirmPage.btnPurchase),
                Time.time(10000),
                Click.on(StoreConfirmPage.btnOk),
                Time.time(10000)
        );
    }

    public static Purchase purchase(){
        return instrumented(Purchase.class);
    }
}
