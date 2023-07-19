package mobileTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import mobilePage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;
import webTest.WebTestBase;
import webTest.allOrdersTest;
import webTest.homeTest;
import webTest.loginTest;

import java.time.Duration;


public class PharmacyOrderTest extends MobileTestBase{

    public AndroidTouchAction actions;
    SplashPage splashPage;
    LoginPage loginPage;
    HomePage homePage;
    PharmacyPage pharmacyPage;
    CheckoutPage checkoutPage;
    VerfiyEmailPage verfiyEmailPage;
    CartScreenPage cartScreenPage;
    allOrdersTest  allOreders;
    TrackOrderPage trackOrder;


    private void scrollDown(){
        Dimension dimention = driver.manage().window().getSize();
        int scrollStart = (int) (dimention.getHeight()* 0.8);
        int scrollEnd = (int) (dimention.getHeight()* 0.1);

         actions = new AndroidTouchAction(driver)
                .press(PointOption.point(0,scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(0,scrollEnd)).release().perform();
    }

    @Test
    public void pharmacyOrder() throws InterruptedException {

        splashPage = new SplashPage((AppiumDriver<MobileElement>) driver);
        loginPage = new LoginPage((AppiumDriver<MobileElement>) driver);
        homePage= new HomePage((AppiumDriver<MobileElement>) driver);
        pharmacyPage = new PharmacyPage((AppiumDriver<MobileElement>) driver);
        checkoutPage = new CheckoutPage((AppiumDriver<MobileElement>) driver);
        verfiyEmailPage = new VerfiyEmailPage((AppiumDriver<MobileElement>) driver);
        cartScreenPage = new CartScreenPage((AppiumDriver<MobileElement>) driver);
        trackOrder = new TrackOrderPage((AppiumDriver<MobileElement>) driver);
        splashPage.clickSkip();
        loginPage.openCountryCodeList();
        loginPage.selectEgyptCode();
        loginPage.enterUserPhoneNumber("01033303330");
        loginPage.clickContinue();
        loginPage.enterUserPassword("123456");
        loginPage.clickConfirmToLogin();
        //verfiyEmailPage.clickVerifyLater();
        homePage.enableAppLocation();
        homePage.clickAllowNotification();
        // one location saved
       // homePage.clickConfirmLocation();
        // more than one saved location
        homePage.confirmSimilarLocation();
     // homePage.clickCancelStoreRate();
        pharmacyPage.clickpharmacyIndustryBt();
        pharmacyPage.clickNearestPharmacyCover();
        pharmacyPage.clickPharmacyFirstBrand();
        pharmacyPage.clickAddButton();
        pharmacyPage.openOrderPriceList();
        cartScreenPage.clickCheckout();
        pharmacyPage.clickLessThan100();
       // Thread.sleep(3000);
        pharmacyPage.clickConfirmBtn();
       // Thread.sleep(3000);
        checkoutPage.checkCashPaymentMethod();

        checkoutPage.getDeliveryFee();

        scrollDown();
        actions.tap(ElementOption.element(driver.findElement(By.id("com.mnasat.nashmi:id/tv_total_price")))).perform();

        checkoutPage.getTotalAmount();

        Assert.assertEquals(checkoutPage.DeliveryFee,checkoutPage.TotalAmount);
        Thread.sleep(3000);
        checkoutPage.clickplaceOrderBtnPharmacy();
        trackOrder.getOrderNumber();

        WebTestBase testBase = new WebTestBase();
        testBase.startDriver("chrome");
        Thread.sleep(3000);
        new loginTest().login();
        new homeTest().openOrders();
        Thread.sleep(3000);
        allOreders = new allOrdersTest();
        allOreders.openOrderDeatails();


    }
}
