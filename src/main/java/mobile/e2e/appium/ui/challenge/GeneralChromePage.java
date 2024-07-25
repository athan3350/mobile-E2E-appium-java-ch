package mobile.e2e.appium.ui.challenge;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GeneralChromePage {
    private GeneralChromePage() {
    }

    public static final Target TXT_INSERT_URL = Target.the("URL").located(By.id("search_box_text"));

}
