package mobile.e2e.appium.ui.challenge;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChallengePage {
    private ChallengePage() {
    }

    public static final Target LBL_HEADER_EUROCOPE_MODAL = Target.the("Label of Europe cup main modal ").locatedBy("//android.widget.TextView[@text=\"Data Privacy\"]");
    public static final Target BTN_ACCEPT_EUROCOPE_MODAL = Target.the("Button accept modal ").locatedBy("//android.widget.Button[@text=\"Save\"]");
    public static final Target LBL_LOGIN = Target.the("Label main page successful").locatedBy("//android.widget.TextView[@text=\"Login\"]");
    public static final Target TXT_FIRST_OPTION = Target.the("URL").locatedBy("(//*[@resource-id=\"com.android.chrome:id/line_1\"])[1]");

}
