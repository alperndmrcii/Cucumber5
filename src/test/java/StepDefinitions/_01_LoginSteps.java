package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_LoginSteps {
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        // System.out.println("Merhaba 1");
        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        //System.out.println("Merhaba 2");
        DialogContent dc = new DialogContent();
        dc.findAndSend(dc.username, "turkeyts");
        dc.findAndSend(dc.password, "TechnoStudy123");
        dc.findAndClick(dc.loginButton);

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        System.out.println("Merhaba 3");
    }
}
