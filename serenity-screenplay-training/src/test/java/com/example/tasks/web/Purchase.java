package com.example.tasks.web;

import com.example.interactions.Time;
import com.example.userinterfaces.screens.StoreConfirmPage;
import com.example.userinterfaces.screens.StorePage;
import com.example.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.fasterxml.jackson.databind.JsonNode;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Purchase implements Task {

    public final String name;

    public final String country;

    public final String city;

    public final String creditCard;

    public final String month;

    public final String year;

    public Purchase (String name, String country, String city, String creditCard, String month, String year){
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditCard = creditCard;
        this.month = month;
        this.year = year;

    }

    public static Performable withData(String name, String country, String city, String creditCard, String month, String year){
        return instrumented(Purchase.class, name, country, city, creditCard, month, year);
    }

    /*public static Performable withData() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(new File("data.json"));
        JsonNode dataNode = rootNode.get(0);

        String name = dataNode.get("name").asText();
        String country = dataNode.get("country").asText();
        String city = dataNode.get("city").asText();
        String creditCard = dataNode.get("credit_card").asText();
        String month = dataNode.get("month").asText();
        String year = dataNode.get("year").asText();

        return instrumented(Purchase.class, name, country, city, creditCard, month, year);

    }*/

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(

                WaitUntil.the(StoreConfirmPage.NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(name).into(StoreConfirmPage.NAME),

                WaitUntil.the(StoreConfirmPage.COUNTRY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(country).into(StoreConfirmPage.COUNTRY),

                WaitUntil.the(StoreConfirmPage.CITY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(city).into(StoreConfirmPage.CITY),

                WaitUntil.the(StoreConfirmPage.CREDITCARD, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(creditCard).into(StoreConfirmPage.CREDITCARD),

                WaitUntil.the(StoreConfirmPage.MONTH, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(month).into(StoreConfirmPage.MONTH),

                WaitUntil.the(StoreConfirmPage.YEAR, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(year).into(StoreConfirmPage.YEAR),

                Click.on(StoreConfirmPage.btnPurchase),
                Time.time(10000),
                Click.on(StoreConfirmPage.btnOk),
                Time.time(10000)


        );
    }

}
