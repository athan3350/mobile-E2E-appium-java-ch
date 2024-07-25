package mobile.e2e.appium.tasks.webApp;

import mobile.e2e.appium.ui.challenge.GeneralChromePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.HashMap;
import java.util.Map;

import static mobile.e2e.appium.constants.KeysToRememberConstants.BASE_URI_WEB_APP;
import static mobile.e2e.appium.ui.challenge.ChallengePage.TXT_FIRST_OPTION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowserTask implements Task {
    Map<String, String> data = new HashMap<>();



    public static OpenBrowserTask withData() {
        return instrumented(OpenBrowserTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(GeneralChromePage.TXT_INSERT_URL, WebElementStateMatchers.isCurrentlyVisible())
                        .forNoMoreThan(10).seconds(),
                Enter.theValue(BASE_URI_WEB_APP).into(GeneralChromePage.TXT_INSERT_URL),
                Click.on(TXT_FIRST_OPTION)
        );
    }
}
