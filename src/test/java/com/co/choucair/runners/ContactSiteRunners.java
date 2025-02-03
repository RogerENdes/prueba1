package com.co.choucair.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features="src/test/resources/features/contact_site.feature",
        glue="com.co.choucair.stepdefinitions",
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE

        )

public class ContactSiteRunners {




}
