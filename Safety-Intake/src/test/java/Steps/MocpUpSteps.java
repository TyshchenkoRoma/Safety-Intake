package Steps;

import Pages.AppLauncherPage;
import Pages.BasePage;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.open;

public class MocpUpSteps {

    LoginPage loginPage = new LoginPage();
    BasePage basePage;
    AppLauncherPage appLauncherPage;

    @Given("^user opened the login page$")
    public void user_opened_the_login_page() {
        open(LoginPage.URL);
    }

    @When("^user entered login password and enter$")
    public void user_entered_login_password_and_enter() {
        basePage = loginPage.logIn();
    }

    @When("^user go to Home page via AppLauncher$")
    public void user_go_to_Home_page_via_AppLauncher() {
        appLauncherPage = basePage.openAppLauncher();
        appLauncherPage.openHomePage();
    }

    @Then("^Source Document Status Review is present$")
    public void source_Document_Status_Review_is_present() {

    }

    @Then("^Source document list is present$")
    public void source_document_list_is_present() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Chatter is present$")
    public void chatter_is_present() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Recent Records is present$")
    public void recent_Records_is_present() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
