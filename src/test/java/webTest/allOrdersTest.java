package webTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mobilePage.TrackOrderPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import webPage.allOrdersPage;

import java.util.concurrent.TimeUnit;

public class allOrdersTest extends WebTestBase {

    allOrdersPage allOrdersPage;
    JavascriptExecutor js;


    public void scrollDown() {
        js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,500)");
    }

@Test
    public void openOrderDeatails () throws InterruptedException {
        allOrdersPage = new allOrdersPage(driver);
    driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
    allOrdersPage.openAdvancedSearch();
    Thread.sleep(3000);
        allOrdersPage.setOrderNumber();
        allOrdersPage.openOrderStatusSection();
        allOrdersPage.uncheckDriverAssigned();
        allOrdersPage.uncheckPickingUp();
        allOrdersPage.uncheckDelivering();
        //allOrdersPage.checkDelivered();
        allOrdersPage.clickSearch();
        scrollDown();
        allOrdersPage.openOrderDetails();
        

 //  Assert.assertTrue(allOrdersPage.orderType.getText().contains("Order Type"));

    }
}
