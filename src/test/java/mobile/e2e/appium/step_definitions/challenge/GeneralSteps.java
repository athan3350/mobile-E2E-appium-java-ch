package mobile.e2e.appium.step_definitions.challenge;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;

public class GeneralSteps {

    @Given("{word} is an user")
    public void initializeActor(String nameActor) {
        OnStage.theActorCalled(nameActor).describedAs("Chrome actor");
    }
}
