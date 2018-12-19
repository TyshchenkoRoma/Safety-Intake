package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage {
    @Then("^Safety home page was opened$")
    public void safetyHomePageWasOpened() {

    }

    @Given("^user opened the safary browzer$")
    public void userOpenedTheSafaryBrowzer() {
        
    }

    @Given("^user opened the login page$")
    public void userOpenedTheLoginPage() {
    }

    @Then("^browser was closed$")
    public void browserWasClosed() {

    }

    @When("^user entered login and \"([^\"]*)\" and clicked \"([^\"]*)\" button$")
    public void userEnteredLoginAndAndClickedButton(String user, String pasword) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
