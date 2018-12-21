package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {
    public static final String URL = "https://iqvia-safety--dev1.cs107.my.salesforce.com";
    private By usernameField = By.cssSelector("#username");
    private By passwordField = By.cssSelector("#password");

    private String login = "roman.khudyakov@highpointsolutions.com.safety.dev1";
    private String password = "Poqw09123";

    public BasePage logIn() {
        $(usernameField).setValue(login);
        $(passwordField).setValue(password).pressEnter();
        return new BasePage();
    }
}
