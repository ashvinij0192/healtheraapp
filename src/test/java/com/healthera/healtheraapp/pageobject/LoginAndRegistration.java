package com.healthera.healtheraapp.pageobject;


import com.healthera.healtheraapp.CONSTANT;
import com.healthera.healtheraapp.PageHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginAndRegistration {
    private AndroidDriver<MobileElement> driver;
    private PageHelper pageHelper;
    public LoginAndRegistration(AndroidDriver<MobileElement> driver, PageHelper helper){
        this.pageHelper = helper;
        this.driver = driver;
    }

    public void  continueWithEmail(){
        pageHelper.performClickEventById("emailImageView");
    }

    public void enterEmailId(String emailId){
        pageHelper.performSendKeyEventById("emailEditText",emailId);

    }
    public boolean isEmailInputTextboxDisplayed(){
       return pageHelper.isDisplayed("emailEditText");

    }
    public void enterPassword(String password){
        pageHelper.performSendKeyEventById("passwordEditText",password);
    }

    public void pressContinue(){
        pageHelper.performClickEventById("circleProgressButton");
    }

    public void enterFirstName(String firstName){
        pageHelper.performSendKeyEventById("firstNameEditText",firstName);
    }
    public void enterLastName(String lastName){
        pageHelper.performSendKeyEventById("lastNameEditText",lastName);
    }
    public void enterBirthDate(String dob){
        pageHelper.performSendKeyEventById("dateOfBirthEditText",dob);
    }
    public String getPasswordInfoText(){
       return  pageHelper.getText("passwordInfoText");
    }

    public void clearPasswordField(){
        pageHelper.clearInputField("passwordInfoText");
    }
    public void clearFirstNameField(){
        pageHelper.clearInputField("firstNameEditText");
    }
    public void clearLastNameField(){
        pageHelper.clearInputField("lastNameEditText");
    }
    public void clearDOBField(){
        pageHelper.clearInputField("dateOfBirthEditText");
    }
    public void clearEmailIdField(){
        pageHelper.clearInputField("emailEditText");
    }
    public String getErrorText(){
        return pageHelper.getText("textinput_error");
    }
    public boolean isErrorTextDisplayed(){
        return pageHelper.isDisplayed("textinput_error");
    }
    public String getProfileMessage(){
        return pageHelper.getText("textViewProfileDetails");
    }
    public boolean isProgressButtonEnabled(){
        return pageHelper.isEnabled("circleProgressButton");
    }
    public void acceptProductConsent(){
        pageHelper.performClickEventById("productConsentAppCompatCheckBox");
    }
    public void acceptTermAndConditions(){
        pageHelper.performClickEventById("termsAppCompatCheckBox");
    }
    public boolean isTermAndConditionHeadingTextDisplayed(){
        return pageHelper.isEnabled("textView14");
    }
    public boolean isTermAndCondInfoDisplayed(){
        return pageHelper.isDisplayed("textView14");
    }
    public String getTermAndConditionHeading(){
        return pageHelper.getText("textView13");
    }
    public String getTermAndConditionInfo(){
        return pageHelper.getText("textView14");
    }
    public boolean isMarketingAppCompatCheckBoxSelected(){
        return pageHelper.isSelected("marketingAppCompatCheckBox");
    }
    public boolean isEmailAppCompatCheckBoxSelected(){
        return pageHelper.isSelected("emailAppCompatCheckBox");
    }
    public boolean isSmsAppCompatCheckBoxSelected(){
        return pageHelper.isSelected("smsAppCompatCheckBox");
    }
    public boolean isOpenMyEmailButtonDisplayed(){
        return pageHelper.isDisplayed("buttonOpenMyEmail");
    }
    public boolean isEmailDisplayed(){
        return pageHelper.isDisplayed("textEmail");
    }
    public String getEmailText(){
        return pageHelper.getText("textEmail");
    }
    public String getPopulatedEmailId(){return pageHelper.getText("emailEditText");}
}
