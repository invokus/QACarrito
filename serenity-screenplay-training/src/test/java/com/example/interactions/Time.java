package com.example.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Time implements Interaction {

    private long time;

    @Override
    public <T extends Actor> void performAs(T actor){
        try {
            Thread.sleep(time * 1000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    public static Time time(long time){
        return instrumented(Time.class, time);
    }
}
