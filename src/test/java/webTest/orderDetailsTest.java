package webTest;

import mobilePage.CheckoutPage;
import mobilePage.TrackOrderPage;
import mobileTest.MobileTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import webPage.OrderDetailsWebPage;

public class OrderDetailsTest extends WebTestBase {

    OrderDetailsWebPage orderDetailsWebPage;
    CheckoutPage checkoutPage;
    MobileTestBase mobileTestBase;

    TrackOrderPage trackOrderPage;

    @Test
    public void assertOnOrderDetails() {
        orderDetailsWebPage = new OrderDetailsWebPage(driver);
        mobileTestBase = new MobileTestBase();
        checkoutPage = new CheckoutPage(MobileTestBase.driver);
        trackOrderPage = new TrackOrderPage(MobileTestBase.driver);
        String deliveryFee = orderDetailsWebPage.getDeliveryFeeUser(driver);
        String totalPrice = orderDetailsWebPage.getFinalTotal(driver);

        Assert.assertEquals(orderDetailsWebPage.getOrderNumber(driver), "Order Number: " + trackOrderPage.OrderNumber);
        // Transform the Actual Result String to int , Get The Correct Number Only From expected String "10.0 SAR"
        Assert.assertEquals(Integer.parseInt(deliveryFee),Integer.parseInt(checkoutPage.DeliveryFee.split("\\.")[0]));
        Assert.assertEquals(totalPrice+".0 SAR",(checkoutPage.TotalAmount));

    }
}
