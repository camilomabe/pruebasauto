package com.co.cmb.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target LABEL_HOME_PAGE = Target.the("texto home page").located(By.id("big3"));
    public static final Target IMPUT_USER = Target.the("usuario").located(By.id("user"));
    public static final Target IMPUT_PASSWORD = Target.the("contraseña").located(By.id("pass"));
    public static final Target BUTTON_LOGIN = Target.the("Iniciar Sesión").located(By.id("submit"));
    public static final Target LABEL_FORM_PAGE = Target.the("texto Formulario de pago").located(By.xpath("//h2[contains(text(),'Formulario de pago')]"));


}