package mobileTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobilePage.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SupermarketTest extends MobileTestBase{
    HomePage homePage;
    SupermarketPage supermarketPage;
    SupermarketCartPage supermarketCartPage;
    OrderDetailsPage orderDetailsPage;
    CheckoutPage checkoutPage;
  TrackOrderPage trackOrderPage;
  public void scrollDown (){
    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Total Amount\").instance(0))").click();

  }

  @Test
    public void supermarketOrder () throws InterruptedException {
        supermarketPage = new SupermarketPage((AppiumDriver<MobileElement>) driver);
    supermarketCartPage = new SupermarketCartPage((AppiumDriver<MobileElement>) driver);
    orderDetailsPage = new OrderDetailsPage((AppiumDriver<MobileElement>) driver);
      homePage = new HomePage((AppiumDriver<MobileElement>) driver);
    checkoutPage = new CheckoutPage((AppiumDriver<MobileElement>) driver);
    trackOrderPage = new TrackOrderPage((AppiumDriver<MobileElement>) driver);
      homePage.openSupermarket();
      driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        supermarketPage.openNearestSupermarket();
      driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
      supermarketPage.getDeliveryFee();
        supermarketPage.selectFirstBrand();
        supermarketPage.addOneItem();
        supermarketPage.increaseItem();
        supermarketPage.addOTwoItems();
        supermarketPage.addThreeItems();
        supermarketPage.addFourItems();
        supermarketPage.openCart();
    driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
    supermarketCartPage.getDeliveryFee();
   // Assert.assertEquals(supermarketPage.SupermarketDeliveryFee,supermarketCartPage.TotalDeliveryFee);
    supermarketCartPage.clickCheckout();
    orderDetailsPage.choosePriceLessThan100();
    orderDetailsPage.clickSubmit();
    checkoutPage.getDeliveryFee();
    //Assert.assertEquals(supermarketCartPage.TotalDeliveryFee,checkoutPage.DeliveryFee);
    Thread.sleep(2000);
    checkoutPage.checkCashPaymentMethod();
    scrollDown();
    checkoutPage.getTotalAmount();
    //Assert.assertEquals(checkoutPage.DeliveryFee,checkoutPage.TotalAmount);
    checkoutPage.placeSupermarketOrder();
    trackOrderPage.getOrderNumber();



    }
}
