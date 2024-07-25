package mobile.e2e.appium.step_definitions.challenge;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mobile.e2e.appium.questions.ChallengeQuestion;
import mobile.e2e.appium.tasks.webApp.OpenBrowserTask;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class ChallengeSteps {

    @When("Want to access to the EU web page")
    public void accessEUWebPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenBrowserTask.withData()
        );
    }

    @Then("we want to validate that I can access to the correct page")
    public void validateCorrectAccess() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("The Eurocup web main page was: ", ChallengeQuestion.getInfoCorrectEuroWebAccess(), is("Login"))
        );
    }
}
