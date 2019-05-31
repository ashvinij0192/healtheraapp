package com.healthera.healtheraapp;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import java.net.MalformedURLException;
import java.net.URL;

public class  DriverFactory {
    private static DriverFactory driverFactory;
    public AndroidDriver<MobileElement> driver;

    private DriverFactory() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 3 API 26");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.healthera.healtheraapp");
        caps.setCapability("appActivity","com.facebook.CustomTabActivity");
        caps.setCapability("noReset","false");
        this.driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
    }


    public static DriverFactory getDriverFactory() {
        try{
            if(driverFactory == null){
                driverFactory = new DriverFactory();

            }
        }catch (Exception ex){

        }

        return driverFactory;
    }

    public AndroidDriver<MobileElement>  getDriver(){
        if(this.driver == null && driverFactory == null){
            getDriverFactory();
        }
        return this.driver;
    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
