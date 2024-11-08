package com.co.cmb.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class InteractionDemo implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {



    }

    public static InteractionDemo on() {
        return Instrumented.instanceOf(InteractionDemo.class).withProperties();
    }
}
