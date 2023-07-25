package mobileTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobilePage.HomePage;
import mobilePage.LoginPage;
import mobilePage.SplashPage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends MobileTestBase{
    SplashPage splashPage;
    LoginPage loginPage;
    HomePage homePage;

    @Test
    public void logIN () throws InterruptedException {

        splashPage = new SplashPage((AppiumDriver<MobileElement>) driver);
        loginPage = new LoginPage((AppiumDriver<MobileElement>) driver);
        homePage = new HomePage((AppiumDriver<MobileElement>) driver);
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        splashPage.clickSkip();
        loginPage.openCountryCodeList();
        loginPage.selectEgyptCode();
        loginPage.enterUserPhoneNumber("01150300594");
        loginPage.clickContinue();
        loginPage.enterUserPassword("123456");
        loginPage.clickConfirmToLogin();
       //homePage.enableAppLocation();
        homePage.confirmSimilarLocation();
}
}
