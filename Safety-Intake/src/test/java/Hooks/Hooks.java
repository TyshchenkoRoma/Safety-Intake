package Hooks;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void SetUp ()
    {
        Configuration.screenshots = true;
        Configuration.browser = "safari";
    }
}
