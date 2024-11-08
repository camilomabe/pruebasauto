package com.co.cmb.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class Hooks {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }

    @After
    public void close() {
        getDriver().close();
    }
}
