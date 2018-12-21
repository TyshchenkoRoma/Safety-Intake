package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    private By appLauncherButton = By.cssSelector(".slds-icon-waffle");

    public AppLauncherPage openAppLauncher() {
        $(appLauncherButton).click();

        return new AppLauncherPage();
    }
}
