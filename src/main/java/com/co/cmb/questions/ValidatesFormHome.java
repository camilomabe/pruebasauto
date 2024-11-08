package com.co.cmb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

import static com.co.cmb.userinterfaces.LoginPage.LABEL_FORM_PAGE;

public class ValidatesFormHome implements Question<String> {

    public static Question<String> formsText() {
        return new ValidatesFormHome();
    }

    @Override
    @Step("{0} validates text form home")
    public String answeredBy(Actor actor) {
        return LABEL_FORM_PAGE.resolveFor(actor).getText();
    }
}
