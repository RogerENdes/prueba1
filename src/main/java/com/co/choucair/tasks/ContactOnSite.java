package com.co.choucair.tasks;

import com.co.choucair.models.ContactLomBokData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.choucair.userinterfaces.ContantsPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ContactOnSite implements Task {

protected  ContactLomBokData ContactLomBokData;

    public ContactOnSite(ContactLomBokData contactLomBokData) {
        this.ContactLomBokData = contactLomBokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTNCONTACT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTNCONTACT),
                Enter.theValue(ContactLomBokData.getEmail()).into(TXT_EMAIL),
                Enter.theValue(ContactLomBokData.getName()).into(TXT_NAME),
                Enter.theValue(ContactLomBokData.getMessage()).into(TXT_MESSAJE_CONTACT),
                Click.on(BTN_SEND)


        );



    }

    public static ContactOnSite on(ContactLomBokData ContactLomBokData){
        return Instrumented.instanceOf(ContactOnSite.class).withProperties(ContactLomBokData);
    }
}
