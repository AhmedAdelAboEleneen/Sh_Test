package webTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobilePage.CheckoutPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import webPage.orderDetailsPage;

import static org.testng.AssertJUnit.assertEquals;

public class orderDetailsTest extends WebTestBase{

    orderDetailsPage orderDetailsPage;


    @Test
    public void checkOrderDetails() throws InterruptedException {
        orderDetailsPage=new orderDetailsPage(driver);
        orderDetailsPage.getHandle(driver);
        orderDetailsPage.getDeliveryFeeForUser(driver);
       Assert.assertEquals(orderDetailsPage.DeliverFeeForUser, "30");
        orderDetailsPage.getFinalTotalPrice(driver);
        Assert.assertEquals(orderDetailsPage.FinalTotal, "30");
    }

}
