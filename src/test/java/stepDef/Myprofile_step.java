package stepDef;

import base.Setup;
import io.cucumber.java.en.Then;
import pageObject.Profile_page;

public class Myprofile_step extends Setup{
Profile_page profile = new Profile_page(driver);
    @Then("I should be able to successfully log in")
    public void iShouldBeAbleToSuccessfullyLogIn() {
        profile.actualmsg();
    }
}
