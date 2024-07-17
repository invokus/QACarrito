package com.example.userinterfaces.screens;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StoreConfirmPage {

    public static final Target NAME = Target.the("Name").located(By.xpath("//input[@id='name']"));

    public static final Target COUNTRY = Target.the("Country").
            locatedBy("//input[@id='country']");

    public static final Target CITY = Target.the("City").
            locatedBy("//input[@id='city']");

    public static final Target CREDITCARD = Target.the("Credit Card").
            locatedBy("//input[@id='card']");

    public static final Target MONTH = Target.the("Month").
            locatedBy("//input[@id='month']");

    public static final Target YEAR = Target.the("Year").
            locatedBy("//input[@id='year']");

    public static final Target btnPurchase = Target.the("Purchase").
            locatedBy("//button[contains(text(),'Purchase')]");

    public static final Target btnOk = Target.the("OK").
            locatedBy("//button[@class='confirm btn btn-lg btn-primary']");
}
