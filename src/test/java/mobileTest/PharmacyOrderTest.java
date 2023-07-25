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


import java.time.Duration;


public class PharmacyOrderTest extends MobileTestBase{

    public AndroidTouchAction actions;
    HomePage homePage;
    PharmacyPage pharmacyPage;
    CheckoutPage checkoutPage;
    CartScreenPage cartScreenPage;
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


        homePage= new HomePage((AppiumDriver<MobileElement>) driver);
        pharmacyPage = new PharmacyPage((AppiumDriver<MobileElement>) driver);
        checkoutPage = new CheckoutPage((AppiumDriver<MobileElement>) driver);
        cartScreenPage = new CartScreenPage((AppiumDriver<MobileElement>) driver);
        trackOrder = new TrackOrderPage((AppiumDriver<MobileElement>) driver);

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



    }
}
