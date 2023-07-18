package mobileTest;

import mobilePage.CheckoutPage;
import mobilePage.HomePage;
import mobilePage.SendPackagePage;
import mobilePage.TrackOrderPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Helper;

public class SendPackageTest extends MobileTestBase {
    HomePage homePage;
    CheckoutPage checkoutPage;

    TrackOrderPage trackOrderPage;

    SendPackagePage sendPackagePage;
    Helper helper ;
    String serviceFee;

    @Test
    public void placeSendPackageOrder() throws InterruptedException {
        homePage = new HomePage(driver);
        checkoutPage = new CheckoutPage(driver);
        sendPackagePage = new SendPackagePage(driver);
        trackOrderPage = new TrackOrderPage(driver);
        helper = new Helper();
        homePage.selectSendPackage();
        sendPackagePage.clickEnterLocationTo();
        sendPackagePage.clickChooseOnMapBtn();
        Thread.sleep(300);
        sendPackagePage.movePinOnMap();
        sendPackagePage.clickDoneBtnOnMap();
        sendPackagePage.sendOrderText();
        sendPackagePage.clickOrderPhoto();
        sendPackagePage.clickCameraOption();
        sendPackagePage.clickCapturePhotoBtn();
        sendPackagePage.clickOkBtn();
        helper.scrollDownIntoMobileView(driver , "\"Next\"").click();
        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Next\").instance(0))").click();
        serviceFee = sendPackagePage.getServiceFee();
        sendPackagePage.clickNextBtn();
        checkoutPage.checkCashPaymentMethod();
        checkoutPage.getDeliveryFee();
        helper.scrollDownIntoMobileView(driver ,"\"Total Amount\"");
        checkoutPage.getTotalAmount();
        checkoutPage.clickPlaceOrder();
        Assert.assertEquals(checkoutPage.DeliveryFee , serviceFee +" SAR");
        trackOrderPage.getOrderNumber();





    }
}
