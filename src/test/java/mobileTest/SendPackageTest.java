package mobileTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobilePage.CheckoutPage;
import mobilePage.HomePage;
import mobilePage.SendPackagePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SendPackageTest extends MobileTestBase {
    HomePage homePage;
    CheckoutPage checkoutPage;

    SendPackagePage sendPackagePage;
    String serviceFee;

    String deliveryFee;
    @Test
    public void placeSendPackageOrder() throws InterruptedException {
        homePage = new HomePage(driver);
        checkoutPage = new CheckoutPage(driver);
        sendPackagePage = new SendPackagePage(driver);
        LoginTest loginTest = new LoginTest();
        loginTest.logIN();
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
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Next\").instance(0))").click();
        serviceFee = sendPackagePage.getServiceFee();
        sendPackagePage.clickNextBtn();
        checkoutPage.checkCashPaymentMethod();
        checkoutPage.getDeliveryFee();
        scrollDown();

        //deliveryFee = checkoutPage.getDeliveryFee();
        checkoutPage.clickPlaceOrder();
        Assert.assertEquals(checkoutPage.DeliveryFee , serviceFee +" SAR");




    }
}
