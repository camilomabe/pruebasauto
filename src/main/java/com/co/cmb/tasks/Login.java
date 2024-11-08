package com.co.cmb.tasks;

import com.co.cmb.models.UserLoombokData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static com.co.cmb.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    UserLoombokData userLoombokData;

    public Login(UserLoombokData userLoombokData) {
        this.userLoombokData = userLoombokData;
    }

    @Override
    @Step("{0} enters user and password")
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(LABEL_HOME_PAGE, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(userLoombokData.getUser()).into(IMPUT_USER),
                Enter.theValue(userLoombokData.getPass()).into(IMPUT_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }


    public static Login onTheSite(UserLoombokData userLoombokData) {
        return Instrumented.instanceOf(Login.class).withProperties(userLoombokData);
    }
}
