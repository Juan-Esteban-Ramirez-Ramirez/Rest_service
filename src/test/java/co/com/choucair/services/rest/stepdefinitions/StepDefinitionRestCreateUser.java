package co.com.choucair.services.rest.stepdefinitions;

import co.com.choucair.services.rest.model.ModelCreateUserRest;
import co.com.choucair.services.rest.questions.LastResponseStatusCode;
import co.com.choucair.services.rest.tasks.CreateUserRest;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

import java.util.List;

import static co.com.choucair.services.rest.util.Constant.VALUE;
import static co.com.choucair.services.rest.util.enums.RestService.BASE_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionRestCreateUser {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
       theActorCalled("brandon").whoCan(CallAnApi.at(BASE_URL.toString()));
    }

    @When("^you create an user$")
    public void youCreateAnUser(List<ModelCreateUserRest> modelCreateUserRests)  {
        theActorInTheSpotlight().attemptsTo(CreateUserRest.with(modelCreateUserRests));

    }

    @Then("^I should see the user created$")
    public void iShouldSeeTheUserCreated()  {

        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE)));

    }
}
