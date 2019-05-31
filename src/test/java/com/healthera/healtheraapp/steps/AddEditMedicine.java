package com.healthera.healtheraapp.steps;

import com.healthera.healtheraapp.DriverFactory;
import com.healthera.healtheraapp.PageHelper;
import com.healthera.healtheraapp.pageobject.Home;
import com.healthera.healtheraapp.pageobject.Medicines;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;


public class AddEditMedicine {
    public Medicines medicines;
    public Home home;
    @Then("^I should be on medicines screen$")
    public void iShouldBeOnMedicinesScreen() throws Throwable {
        if(home !=null && medicines !=null){
            home = new Home(DriverFactory.getDriverFactory().getDriver(),new PageHelper(DriverFactory.getDriverFactory().getDriver()));
            medicines = new Medicines(DriverFactory.getDriverFactory().getDriver(),new PageHelper(DriverFactory.getDriverFactory().getDriver()));

        }
        medicines.isMedicinesScreenDisplayed();
    }

    @And("^I see add medicine button enabled$")
    public void iSeeAddMedicineButtonEnabled() throws Throwable {
        medicines.isProgressButtonEnabled();
    }

    @When("^I click on add medicine button$")
    public void iClickOnAddMedicineButton() throws Throwable {
        medicines.pressContinue();
    }

    @Then("^I should be on ([^\"]*) screen with option my self and add a dependent$")
    public void iShouldBeOnWhoIsThisForScreenWithOptionMySelfAndAddADependent() throws Throwable {
        Assert.assertEquals(medicines.getWhoIsthisForMessageText(),"Who is this for?");
        assert medicines.isMyselfOptionPopulated();
        assert medicines.isDependentMessagePopulated();
        assert medicines.isDependentOptionPopulated();
    }

    @When("^I click on myself$")
    public void iClickOnMyself() throws Throwable {
        medicines.clickDependentOption();
    }

    @Then("^I should be on add medicine screen$")
    public void iShouldBeOnAddMedicineScreen() throws Throwable {
        assert medicines.getAddMedicinesTitle() == "Add a medicine";
        medicines.isBarcodeScanWidgetPopulated();
        medicines.isSmartPrescriptionWidgetPopulated();
    }

    @And("^I see following option$")
    public void iSeeFollowingOption() throws Throwable {

    }

    @When("^I enter ([^\"]*) tablets$")
    public void iEnterBrufenMgTablets(String arg0) throws Throwable {
        medicines.searchTablet(arg0);
    }

    @And("^I click on search button$")
    public void iClickOnNextButton() throws Throwable {
        medicines.performClickOnSearchOption();
    }

    @Then("^I see When will you run out of screen with following details$")
    public void iSeeWhenWillYouRunOutOfScreenWithFollowingDetails(DataTable dataTable) throws Throwable {
        List<List<String>> list = dataTable.raw();
        for(List row:list){
            assert medicines.getTextBySeq(1).contains(row.get(0).toString());
            assert medicines.getTextBySeq(2).contains(row.get(1).toString());
            assert medicines.getTextBySeq(3).contains(row.get(2).toString());
            assert medicines.getTextBySeq(4).contains(row.get(3).toString());
        }
    }

    @And("^I see default (\\d+) days option selected$")
    public void iSeeDefaultDaysOptionSelected(int arg0) throws Throwable {

    }

    @Then("^I should be on alarm schedule screen with following options$")
    public void iShouldBeOnAlarmScheduleScreenWithFollowingOptions(DataTable dataTable) throws Throwable {
        List<Map<String , String>> list = dataTable.asMaps(String.class, String.class);
            assert medicines.getAlaramTextBySeq(2).contains(list.get(0).get("WHICH DAYS ARE YOU TAKING THE MEDICINE?"));
            assert medicines.getAlaramTextBySeq(4).contains(list.get(0).get("HOW MANY ALARMS TO GO OFF A DAY?"));
            assert medicines.getAlaramTextBySeq(6).contains(list.get(0).get("TIME AND QUANTITY"));
    }

    @Then("^I should be on confirmation screen$")
    public void iShouldBeOnConfirmationScreen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I see ([^\"]*) message$")
    public void iSeeYouHaveAddedBrufenMgTabletsToYourCabinet(String arg) throws Throwable {
        assert arg == medicines.getConfirmationText();
    }

    @When("^I click on confirm button$")
    public void iClickOnConfirmButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I see Brufen (\\d+)mg tablets into my medicine list$")
    public void iSeeBrufenMgTabletsIntoMyMedicineList(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on Brufen (\\d+)mg tablets$")
    public void iClickOnBrufenMgTablets(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be on medicine details screen$")
    public void iShouldBeOnMedicineDetailsScreen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on alarm schedule option$")
    public void iClickOnAlarmScheduleOption() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on WHICH DAYS ARE YOU TAKING THE MEDICINE option$")
    public void iClickOnWHICHDAYSAREYOUTAKINGTHEMEDICINEOption() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I see How often is this dose taken pop up$")
    public void iSeeHowOftenIsThisDoseTakenPopUp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I choose Every Other Day option$")
    public void iChooseEveryOtherDayOption() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on Save button$")
    public void iClickOnSaveButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
