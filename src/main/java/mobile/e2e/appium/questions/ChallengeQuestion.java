package mobile.e2e.appium.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static mobile.e2e.appium.ui.challenge.ChallengePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ChallengeQuestion {

    public static Question<String> getInfoCorrectEuroWebAccess() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Check.whether(the(BTN_ACCEPT_EUROCOPE_MODAL), isVisible())
                        .andIfSo(Click.on(BTN_ACCEPT_EUROCOPE_MODAL)),
                WaitUntil.the(LBL_LOGIN, WebElementStateMatchers.isCurrentlyVisible())
                .forNoMoreThan(10).seconds()
        );

        return actor -> Text.of(LBL_LOGIN).viewedBy(actor).asString().trim();
    }

}
