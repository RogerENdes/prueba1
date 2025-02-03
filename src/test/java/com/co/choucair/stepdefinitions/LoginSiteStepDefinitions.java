package com.co.choucair.stepdefinitions;

import com.co.choucair.models.LoginLomBokData;
import com.co.choucair.questions.ValidateTheMessaje;
import com.co.choucair.tasks.LoginOnSite;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import org.mockito.internal.matchers.Contains;

import static com.co.choucair.userinterfaces.LoginPage.*;
import static com.co.choucair.utils.Contants.*;
import static org.hamcrest.Matchers.containsString;

public class LoginSiteStepDefinitions {

    @Given("the user is on the demoblaze")
    public void theUserIsOnTheDemoblaze() {

        OnStage.theActorCalled(ACTOR).wasAbleTo(
                Open.url(URL)
        );



    }

    @When("attempts to log in")
    public void attemptsToLogIn(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
        LoginOnSite.on(LoginLomBokData.setData(dataTable).get(0))
);
    }

    @Then("^validate the text on screen (.*)$")
    public void validateTheTextOnScreenWelcome(String messaje) {

        String mensaje = messaje;
        String extractedMessage = "";
        if (mensaje.contains("Welcome")) {
            extractedMessage = "Welcome";
        }

        System.out.println(messaje);
            System.out.println(TXTMESSAJE);

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTheMessaje.on(TXTMESSAJE)

                , containsString(messaje))
        );

    }




}
