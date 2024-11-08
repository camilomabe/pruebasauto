package com.co.cmb.stepdefinitions;

import com.co.cmb.questions.ValidatesFormHome;
import com.co.cmb.tasks.Login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import org.hamcrest.CoreMatchers;

import static com.co.cmb.models.UserLoombokData.setData;
import static com.co.cmb.utils.GlobalData.URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Given("^(.*) is on the demo page$")
    public void theUserIsOnTheSerenityDemoPage(String actor) {
        theActorCalled(actor).wasAbleTo(Open.url(URL));
    }

    @When("attempts to log in")
    public void attemptsToLogIn(DataTable dataTable) {

        theActorInTheSpotlight().attemptsTo(
                Login.onTheSite(setData(dataTable).get(0))
        );
    }

    @Then("^validates the text on screen (.*)$")
    public void validatesBusinessMeeting(String text) {
        theActorInTheSpotlight().should(seeThat(ValidatesFormHome.formsText(),
                CoreMatchers.equalTo(text)));
    }


}
