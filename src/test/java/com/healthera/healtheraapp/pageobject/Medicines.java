package com.healthera.healtheraapp.pageobject;


import com.healthera.healtheraapp.PageHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Medicines {
    private AndroidDriver<MobileElement> driver;
    private PageHelper pageHelper;
    public Medicines    (AndroidDriver<MobileElement> driver, PageHelper helper){
        this.pageHelper = helper;
        this.driver = driver;
    }


    public void pressContinue(){
        pageHelper.performClickEventById("circleProgressButton");
    }
    public boolean isProgressButtonEnabled(){
        return pageHelper.isEnabled("circleProgressButton");
    }
    public boolean isMedicinesScreenDisplayed(){
        return pageHelper.isDisplayed("recyclerViewRemedies");
    }
    public String getWhoIsthisForMessageText(){
        return pageHelper.getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");
    }
    public boolean isMyselfOptionPopulated(){
        return pageHelper.isDisplayed("textTitle");
    }
    public void clickOnMySelfOption(){
        pageHelper.performClickEventById("textTitle");
    }
    public boolean isDependentOptionPopulated(){
        return pageHelper.isDisplayedByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.Button");
    }
    public void clickDependentOption(){
        pageHelper.performClickEventByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.Button");
    }
    public boolean isDependentMessagePopulated(){
        return pageHelper.isDisplayedByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.TextView");
    }
    public String getDependentMessageText(){
        return pageHelper.getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.TextView");
    }
    public void clickOnAddDependent(){
        pageHelper.performClickEventByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.Button");
    }
    public boolean isBarcodeScanWidgetPopulated(){
       return pageHelper.isDisplayed("imageViewBarcodeMedicine");
    }
    public boolean isSmartPrescriptionWidgetPopulated(){
        return pageHelper.isDisplayed("imageViewBarcodePrescription");
    }
    public String getAddMedicinesTitle(){
       return pageHelper.getText("textToolbarTitle");
    }
    public void searchTablet(String tablet){
        pageHelper.performSendKeyEventById("autoCompleteTextViewMedicineNames",tablet);
    }
    public void performClickOnSearchOption(){
        pageHelper.performClickEventById("imageViewSearch");
    }
    public String getTextBySeq(int seq){
       return pageHelper.getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView["+seq+"]");
    }
    public String getAlaramTextBySeq(int seq){
        return pageHelper.getTextByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout["+seq+"]/android.widget.RelativeLayout/android.widget.TextView");
    }
    public boolean isFirstOptionSelected(){
        return pageHelper.isSelectedByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]");
    }
    public String getConfirmationText(){
        return pageHelper.getText("textViewMedicineName");
    }
}
