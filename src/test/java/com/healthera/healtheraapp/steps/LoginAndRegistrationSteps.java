package com.healthera.healtheraapp.steps;


import com.healthera.healtheraapp.DriverFactory;
import com.healthera.healtheraapp.PageHelper;
import com.healthera.healtheraapp.pageobject.Home;
import com.healthera.healtheraapp.pageobject.LoginAndRegistration;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginAndRegistrationSteps {
    LoginAndRegistration loginAndRegistration;
    Home home;

    @Given("^I am on Healthera app welcome screen$")
    public void iAmOnHealtheraAppWelcomeScreen() throws Throwable {
        home = new Home(DriverFactory.getDriverFactory().getDriver(),new PageHelper(DriverFactory.getDriverFactory().getDriver()));
        loginAndRegistration = new LoginAndRegistration(DriverFactory.getDriverFactory().getDriver(),new PageHelper(DriverFactory.getDriverFactory().getDriver()));
    }

    @When("^I click on continue email option$")
    public void iClickOnContinueEmailOption() throws Throwable {
        loginAndRegistration.continueWithEmail();
    }

    @Then("^I should be on next screen with email input text box$")
    public void iShouldBeOnNextScreenWithEmailInputTextBox() throws Throwable {
        loginAndRegistration.isEmailInputTextboxDisplayed();

    }

    @When("^I Enter email ([^\"]*)$")
    public void iEnterEmail(String emailId) throws Throwable {
        loginAndRegistration.enterEmailId(emailId);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() throws Throwable {
        Assert.assertEquals(loginAndRegistration.isProgressButtonEnabled(),true);
        loginAndRegistration.pressContinue();
    }

    @Then("^I should be on personal details screen$")
    public void iShouldBeOnPersonalDetailsScreen() throws Throwable {
       loginAndRegistration.getProfileMessage();
    }

    @And("^I should see ([^\"]*) message$")
    public void iShouldSeeMessage(String arg0) throws Throwable {
       Assert.assertEquals(loginAndRegistration.getProfileMessage(),"Your Personal Details");
    }

    @And("^I enter my personal details$")
    public void iEnterMyPersonalDetails(DataTable datatable) throws Throwable {
        List<Map<String , String>> list = datatable.asMaps(String.class, String.class);

        loginAndRegistration.enterFirstName(list.get(0).get("First Name"));
        loginAndRegistration.enterLastName(list.get(0).get("Last Name"));
        loginAndRegistration.enterBirthDate(list.get(0).get("DOB"));
        loginAndRegistration.enterEmailId(list.get(0).get("Email"));
        if(list.get(0).get("Password").trim()!="")
        loginAndRegistration.enterPassword(list.get(0).get("Password"));
    }
    @And("^I clear all fields$")
    public void clearAllFields() throws Throwable {
        loginAndRegistration.clearFirstNameField();
        loginAndRegistration.clearLastNameField();
        loginAndRegistration.clearDOBField();
        loginAndRegistration.clearEmailIdField();
        loginAndRegistration.clearPasswordField();
    }
    @Then("^I should see proceed button enabled$")
    public void iCouldSeeProceedButtonEnabled() throws Throwable {
      Assert.assertEquals(loginAndRegistration.isProgressButtonEnabled(),true);
    }

    @When("^I click on proceed button$")
    public void iClickOnProceedButton() throws Throwable {
        loginAndRegistration.pressContinue();
    }

    @Then("^I should be on term and condition screen with confirm button disabled$")
    public void iShouldBeOnTermAndConditionScreenWithConfirmButtonDisabled() throws Throwable {
        assert loginAndRegistration.isTermAndConditionHeadingTextDisplayed();
        assert loginAndRegistration.isTermAndCondInfoDisplayed();
        assert !loginAndRegistration.isProgressButtonEnabled();
    }

    @When("^I accept product concent and terms & conditions$")
    public void iAcceptAlarmsAndTermsConditions() throws Throwable {
        loginAndRegistration.acceptProductConsent();
        loginAndRegistration.acceptTermAndConditions();
    }

    @Then("^Create account button should be enabled$")
    public void createAccountButtonShouldBeEnabled() throws Throwable {
        assert loginAndRegistration.isProgressButtonEnabled();
    }

    @When("^I click on create account$")
    public void iClickOnCreateAccount() throws Throwable {
        loginAndRegistration.pressContinue();
    }

    @Then("^I should be on GDPR screen with all option selected and done selected$")
    public void iShouldBeOnGDPRScreenWithAllSelectedOptionWithDoneButton() throws Throwable {
        assert loginAndRegistration.isMarketingAppCompatCheckBoxSelected();
        assert loginAndRegistration.isEmailAppCompatCheckBoxSelected();
        assert loginAndRegistration.isSmsAppCompatCheckBoxSelected();
        assert loginAndRegistration.isProgressButtonEnabled();
    }

    @And("^I click on done button$")
    public void iClickOnDoneButton() throws Throwable {
        loginAndRegistration.pressContinue();
    }

    @Then("^I should see verify your email screen$")
    public void iShouldSeeVerifyYourEmailScreen() throws Throwable {
        assert loginAndRegistration.isOpenMyEmailButtonDisplayed();
        assert loginAndRegistration.isEmailDisplayed();
    }

    @And("^I see my email ([^\"]*)$")
    public void iSeeOneWidgetWithEmail(String arg0) throws Throwable {
       Assert.assertEquals(loginAndRegistration.getEmailText(),arg0);
    }

    @Then("^I should be on Login screen with ([^\"]*) email id populated$")
    public void iShouldBeOnLoginScreenEmailIdPopulated(String emailId) throws Throwable {
      Assert.assertEquals(loginAndRegistration.getPopulatedEmailId(),emailId);
    }

    @When("^I enter password ([^\"]*)$")
    public void iEnterPassword(String password) throws Throwable {
        loginAndRegistration.enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {
        loginAndRegistration.pressContinue();
    }

    @Then("^I should be on home page$")
    public void iShouldBeOnHomePage() throws Throwable {
       assert home.isHomeActionDisplayed();
    }
    @When("^I click on medicines option$")
    public void iClickOnMedicinesOption() throws Throwable {
        home.clickOnMedicinesActions();
    }
    @Then("^I should see error message ([^\"]*) for ([^\"]*) field$")
    public void iCouldSeePasswordIsIncorrect(String errorMessage,String field) throws Throwable {
        assert loginAndRegistration.isErrorTextDisplayed();
        if(field == "password")
            Assert.assertEquals(loginAndRegistration.getErrorText(),errorMessage);
        else if(field == "DOB")
            Assert.assertEquals(loginAndRegistration.getErrorText(),errorMessage);
        else if(field == "email")
            Assert.assertEquals(loginAndRegistration.getErrorText(),errorMessage);
    }

    @Then("^I could see error message for DOB field$")
    public void iCouldSeeErrorMessageForDOBField() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I could see proceed button disabled$")
    public void iCouldSeeProceedButtonDisabled() throws Throwable {
        assert !loginAndRegistration.isProgressButtonEnabled();
    }

    @Then("^I could see error message for email field$")
    public void iCouldSeeErrorMessageForEmailField() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I could see error message for password field$")
    public void iCouldSeeErrorMessageForPasswordField() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
