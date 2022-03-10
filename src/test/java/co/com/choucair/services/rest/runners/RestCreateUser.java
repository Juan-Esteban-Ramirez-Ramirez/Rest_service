package co.com.choucair.services.rest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features ="src/test/resources/features/createUser.feature",
        tags = "@HU",
        glue = "co.com.choucair.services.rest.stepdefinitions",
        snippets = SnippetType.CAMELCASE )



public class RestCreateUser {
}
