package com.co.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;


public class ValidateTheTextContact implements Question<String> {


    protected Target element;

    public ValidateTheTextContact(Target element) {
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText();
    }

    public static Question<String>on(Target element){
        return new ValidateTheTextContact(element);
    }
}
