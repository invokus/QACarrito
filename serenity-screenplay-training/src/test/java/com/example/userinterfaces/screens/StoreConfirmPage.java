package com.example.userinterfaces.screens;

import net.serenitybdd.screenplay.targets.Target;

public class StoreConfirmPage {
    public static final Target name = Target.the("Name").
            locatedBy("//input[@id='name']");

    public static final Target country = Target.the("Country").
            locatedBy("//input[@id='country']");

    public static final Target city = Target.the("City").
            locatedBy("//input[@id='city']");

    public static final Target creditCard = Target.the("Credit Card").
            locatedBy("//input[@id='card']");

    public static final Target month = Target.the("Month").
            locatedBy("//input[@id='month']");

    public static final Target year = Target.the("Year").
            locatedBy("//input[@id='year']");

    public static final Target btnPurchase = Target.the("Purchase").
            locatedBy("//button[contains(text(),'Purchase')]");

    public static final Target btnOk = Target.the("OK").
            locatedBy("//button[@class='confirm btn btn-lg btn-primary']");
}
