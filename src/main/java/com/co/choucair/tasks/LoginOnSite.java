package com.co.choucair.tasks;

import com.co.choucair.models.LoginLomBokData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.choucair.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginOnSite implements Task {

protected  LoginLomBokData LoginLomBokData;

    public LoginOnSite(LoginLomBokData LoginLomBokData) {
        this.LoginLomBokData=LoginLomBokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTNLOGIN1, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTNLOGIN1),
                WaitUntil.the(TXT_USER, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(LoginLomBokData.getUser()).into(TXT_USER),
                Enter.theValue(LoginLomBokData.getPass()).into(TXT_PASS),

                Click.on(BTN_LOGIN2)
    );

    }

    public static LoginOnSite on(LoginLomBokData LoginLomBokData){
        return Instrumented.instanceOf(LoginOnSite.class).withProperties(LoginLomBokData);
    }

}
