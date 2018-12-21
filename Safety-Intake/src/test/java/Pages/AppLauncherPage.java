package Pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AppLauncherPage {

    private String homePageText = "Home";

    public HomePage openHomePage() {
        $(byText(homePageText)).scrollTo().click();
        return new HomePage();
    }
}
