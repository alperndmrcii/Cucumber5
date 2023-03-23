package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_CitizenshipSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @And("Navigate to Citizenship page")
    public void navigateToCitizenshipPage() {
       ln.clickFunction(ln.setup);
       ln.clickFunction(ln.parameters);
       ln.clickFunction(ln.Citizenship);
    }

    @When("Citizenship name as {string} short name as {string}")
    public void citizenshipNameAsShortNameAs(String name, String shortname) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.shortName,shortname);
        dc.clickFunction(dc.saveButton);
    }

    @Then("Already exists message should be displayed")
    public void alreadyExistsMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.alreadyExists, "already");
    }
}
