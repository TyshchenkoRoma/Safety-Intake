package Steps;

import Pages.AppLauncherPage;
import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.open;

public class MocpUpSteps {

    private LoginPage loginPage = new LoginPage();
    private BasePage basePage;
    private AppLauncherPage appLauncherPage;
    private HomePage homePage;

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
        homePage = appLauncherPage.openHomePage();
    }

    @Then("^Source Document Status Review is present$")
    public void source_Document_Status_Review_is_present() {
//        Assert.assertTrue(homePage.isSourseDocStatusReviewPresent());
    }

    @Then("^Source document list is present$")
    public void source_document_list_is_present() {
        Assert.assertTrue(homePage.isCaseCandidatsListPresent(), "Source document list isn't present");
    }

    @Then("^Chatter is present$")
    public void chatter_is_present() {
        Assert.assertTrue(homePage.isChaterPresent(), "Chatter isn't present.");
    }

    @Then("^Recent Records is present$")
    public void recent_Records_is_present() {
        Assert.assertTrue(homePage.isRecentRecordPresent(), "Recent Records isn't present");
    }
}
