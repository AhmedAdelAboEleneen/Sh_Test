package mobileTest;

import com.google.common.collect.ImmutableSet;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobilePage.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class ServeYouTest extends MobileTestBase {
    ServeYouPage serveYouPage;
    CheckoutPage checkoutPage;

    TrackOrderPage trackOrderPage;


    public void scrollDown (){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Submit\").instance(0))").click();

    }

    public void scrollDownToTotalAmount (){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Total Amount\").instance(0))").click();

    }
    @Test
    public void serveYouTest() throws InterruptedException {
        checkoutPage=new CheckoutPage((AppiumDriver<MobileElement>) driver);
        serveYouPage= new ServeYouPage((AppiumDriver< MobileElement >) driver);
        trackOrderPage= new TrackOrderPage((AppiumDriver< MobileElement >) driver);
        serveYouPage.clickServeYou();
        serveYouPage.clickcarWashingService();
        scrollDown();
        serveYouPage.clickSubmitButton();
        serveYouPage.enterDetails("Car Washing serve you");
        serveYouPage.enterServicePrice("30");
        serveYouPage.clickApply();
        serveYouPage.clickCheckOutService();
       checkoutPage.getDeliveryFee();
        assertEquals(checkoutPage.DeliveryFee,"30.0 SAR");
        checkoutPage.checkCashPaymentMethod();
        scrollDownToTotalAmount();
        checkoutPage.getTotalAmount();
        assertEquals(checkoutPage.TotalOrderPrice,"30.0 SAR");
        checkoutPage.clickPlaceOrder();
        trackOrderPage.getOrderNumber();

    }
}
