package com.example.userinterfaces.screens;

import net.serenitybdd.screenplay.targets.Target;

public class StorePage {
    public static final Target cart = Target.the("Carrito").
            locatedBy("//a[@id=\"cartur\"]");

    public static final Target firstProduct = Target.the("Samsung galaxy s6").
            locatedBy("//a[@href=\"prod.html?idp_=1\"]");

    public static final Target btnAdd = Target.the("Add to Cart").
            locatedBy("//a[@class='btn btn-success btn-lg']");

    public static final Target secondtProduct = Target.the("Nokia lumia 1520").
            locatedBy("//a[@href=\"prod.html?idp_=2\"]");


    public static final Target home = Target.the("home").
            locatedBy("//a[@href=\"index.html\"]");

    public static final Target placeOrder = Target.the("Place Order").
            locatedBy("//button[contains(text(),'Place Order')]");
}
