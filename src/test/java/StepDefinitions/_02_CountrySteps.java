package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to country page")
    public void navigateToCountryPage() {

        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.countries);

    }
    @When("Create a Country")
    public void createACountry() {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput, "AlpeasdzxaUlk35");
        dc.sendKeysFunction(dc.codeInput, "1241");
        dc.clickFunction(dc.saveButton);
    }

    @Then("Success Message Should Be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.successMessage,"success");
    }

    @When("Create a Country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput, name);
        dc.sendKeysFunction(dc.codeInput,code);
        dc.clickFunction(dc.saveButton);
    }
}
