package com.co.choucair.stepdefinitions;


import com.co.choucair.models.ContactLomBokData;
import com.co.choucair.questions.ValidateTheTextContact;
import com.co.choucair.tasks.ContactOnSite;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;


import static com.co.choucair.userinterfaces.ContantsPage.TXT_TITLES;

import static org.hamcrest.Matchers.containsString;

public class ContactSiteStepDefinitions {

    @When("attempts to contact in")
    public void attemptsToContactIn(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(

                ContactOnSite.on(ContactLomBokData.setData(dataTable).get(0))


        );

    }


    @Then("^Validate text for contact entry (.*)$")
    public void validateTextForContactEntryTitle(String title) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTheTextContact.on(TXT_TITLES)

                , containsString(title))
        );
    }
}
