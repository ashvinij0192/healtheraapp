package com.healthera.healtheraapp.pageobject;


import com.healthera.healtheraapp.PageHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Home {
    private AndroidDriver<MobileElement> driver;
    private PageHelper pageHelper;
    public Home(AndroidDriver<MobileElement> driver, PageHelper helper){
        this.pageHelper = helper;
        this.driver = driver;
    }
    public boolean isHomeActionDisplayed(){
        return pageHelper.isDisplayed("action_schedules");
    }
    public boolean isMedicinesActionDisplayed(){
        return pageHelper.isDisplayed("action_medicines");
    }
    public boolean isOrderActionDisplayed(){
        return pageHelper.isDisplayed("action_orders");
    }
    public boolean isPharmacyActionDisplayed(){
        return pageHelper.isDisplayed("action_pharmacy");
    }
    public boolean isMeActionDisplayed(){
        return pageHelper.isDisplayed("action_me");
    }
    public void clickOnHomeAction(){
         pageHelper.performClickEventById("action_schedules");
    }
    public void clickOnMedicinesActions(){
        pageHelper.performClickEventById("action_medicines");
    }
    public void clickOnOrdersActions(){
        pageHelper.performClickEventById("action_orders");
    }
    public void clickOnPharmacyAction(){
        pageHelper.performClickEventById("action_pharmacy");
    }
    public void clickOnMeAction(){
        pageHelper.performClickEventById("action_medicines");
    }
    public boolean isExistingMedicinesPresent(){
        return pageHelper.isDisplayedByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout");
    }
    public boolean isExistingMedicinesDisplayed(){
        return pageHelper.isDisplayed("layoutMedicines");
    }
    public boolean isGreetingMessageDisplayed(){
        return pageHelper.isDisplayed("textGreeting");
    }
    public boolean isProgressMessageDisplayed(){
        return pageHelper.isDisplayed("textViewProgress");
    }
    public boolean isToolbarTitleDisplayed(){
        return pageHelper.isDisplayed("textToolbarTitle");
    }
    public String getToolBarTitle(){
        return  pageHelper.getText("textToolbarTitle");
    }

}
