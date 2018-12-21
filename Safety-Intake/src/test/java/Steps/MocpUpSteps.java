package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MocpUpSteps {

    @Given("^user opened the login page$")
    public void user_opened_the_login_page() throws Throwable {
        Assert.assertEquals(1,1);
    }

    @When("^user entered login and \"([^\"]*)\" and clicked \"([^\"]*)\" button$")
    public void user_entered_login_and_and_clicked_button(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


    @When("^user go to Home page via AppLauncher$")
    public void user_go_to_Home_page_via_AppLauncher()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Source Document Status Review is present$")
    public void source_Document_Status_Review_is_present()  {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Source document list is present$")
    public void source_document_list_is_present() throws Throwable {
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
