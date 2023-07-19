package mobileTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobilePage.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FoodOrderDeliveryTest extends MobileTestBase{
    HomePage homePage;
    StoreScreenPage storeScreenPage;
    FoodCartPage cartScreenPage;
    CheckoutPage checkoutPage;
    TrackOrderPage trackOrderPage;



    public void scrollDown (){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Total Amount\").instance(0))").click();

    }



    @Test
    public void foodOrderDelivery () throws InterruptedException {
        homePage = new HomePage((AppiumDriver<MobileElement>) driver);
        storeScreenPage = new StoreScreenPage((AppiumDriver<MobileElement>) driver);
        cartScreenPage = new FoodCartPage((AppiumDriver<MobileElement>) driver);
        checkoutPage = new CheckoutPage((AppiumDriver<MobileElement>) driver);
        trackOrderPage = new TrackOrderPage((AppiumDriver<MobileElement>) driver);
        homePage.clickSearchBar();
        homePage.enterPickUpLocation("Dina");
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        homePage.selectFirstStore();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        storeScreenPage.selectFirstItem();
        storeScreenPage.increaseItemByTwo();
        storeScreenPage.addToCart();
        storeScreenPage.openCart();
        cartScreenPage.getTotalPrice();
        cartScreenPage.clickCheckout();
        Thread.sleep(3000);
        checkoutPage.checkCashPaymentMethod();
        Thread.sleep(5000);
        scrollDown();
        Thread.sleep(3000);
        checkoutPage.getOrderPrice();
        Thread.sleep(2000);
        checkoutPage.clickPlaceOrder();
        trackOrderPage.getOrderNumber();
        Assert.assertEquals(cartScreenPage.TotalPrice,checkoutPage.OrderPrice);









    }
}
