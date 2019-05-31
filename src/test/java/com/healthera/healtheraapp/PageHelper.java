package com.healthera.healtheraapp;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageHelper {
    public WebDriverWait wait;
    AndroidDriver<MobileElement> driver;

    public PageHelper(AndroidDriver<MobileElement> driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void performClickEventById(String id){
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id(CONSTANT.ID+id))).click();
    }
    public void performSendKeyEventById(String id, String input){
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id(CONSTANT.ID+id))).sendKeys(input);
    }
    public void clearInputField(String id){
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id(CONSTANT.ID+id))).clear();
    }
    public String getText(String id){
       return  wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id(CONSTANT.ID+id))).getText();
    }
    public boolean isSelected(String id){
        return   wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id(CONSTANT.ID+id))).isSelected();
    }
    public boolean isEnabled(String id){
        return  wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id(CONSTANT.ID+id))).isEnabled();
    }
    public boolean isDisplayed(String id){
        return  wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id(CONSTANT.ID+id))).isDisplayed();
    }
    public boolean isDisplayedByXpath(String xpath){
        return  wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath(xpath))).isDisplayed();
    }
    public void performClickEventByXpath(String xpath){
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath(xpath))).click();
    }
    public boolean isEnabledByXpath(String xpath){
        return  wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath(xpath))).isEnabled();
    }
    public boolean isSelectedByXpath(String xpath){
        return   wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath(xpath))).isSelected();
    }
    public String getTextByXpath(String xpath){
        return  wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath(xpath))).getText();
    }

}
