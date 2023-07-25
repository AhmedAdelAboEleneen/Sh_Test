package mobileTest;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import utilities.Helper;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileTestBase {

    public static AndroidDriver driver;

    // Start driver for android
    @BeforeSuite
    public void startDriver() throws MalformedURLException {

        DesiredCapabilities AndroidObject = new DesiredCapabilities();

        AndroidObject.setCapability("platformName", "Android");

        AndroidObject.setCapability("platformVersion", "12.0");

        AndroidObject.setCapability("deviceName", "Galaxy A72");

        AndroidObject.setCapability("automationName", "UiAutomator2");

        AndroidObject.setCapability("appPackage", "com.mnasat.nashmi");

        AndroidObject.setCapability("appActivity", "com.mnasat.nashmi.presentation.splash.SplashActivity");
        AndroidObject.setCapability("autoGrantPermissions", "true");

        driver = new AndroidDriver <WebElement>(new URL("http://localhost:4723/"), AndroidObject);
//        driver= (AndroidDriver) new AndroidDriver(new URL("http://localhost:4723/wd/hub"), AndroidObject);
    }

   /* // Start driver for iOS
    @BeforeSuite
    public void startDriver() throws MalformedURLException {
        DesiredCapabilities iOSObject = new DesiredCapabilities();
        iOSObject.setCapability("platformName", "");
        iOSObject.setCapability("platformVersion", "");
        iOSObject.setCapability("deviceName", "");
        iOSObject.setCapability("appPackage", "");
        iOSObject.setCapability("appActivity", "");
        driver = new IOSDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), iOSObject);
    }*/

//    @AfterSuite
//    public void stopDriver() {
//
//        driver.quit();
//    }

    //Take Screenshot when test case fail and add it in screenshot folder
    @AfterMethod
    public void screenShootsOnFailure(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {

            System.out.println("Failed!");
            System.out.println("Taking ScreenShot.......");
            Helper.caputreScreenShoot(driver, result.getName());

        }

    }
}