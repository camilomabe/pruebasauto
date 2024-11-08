package com.co.cmb.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/serenityLogin.feature",
        glue = "com.co.cmb.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunner {
}
