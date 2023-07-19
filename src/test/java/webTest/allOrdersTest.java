package webTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import utilities.Helper;
import webPage.allOrdersPage;

import java.util.concurrent.TimeUnit;

public class allOrdersTest extends WebTestBase {

    allOrdersPage allOrdersPage;
    Helper helper;
    //JavascriptExecutor js;

    public void scrollDown(){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("scrollBy(0,500)");}

    @Test
    public void openOrderDeatails() throws InterruptedException {
        allOrdersPage = new allOrdersPage(driver);
        helper = Helper.getInstance();
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
        Thread.sleep(3000);
        helper.scrollDownIntoWebView(allOrdersPage.detailsView, driver);
        allOrdersPage.openOrderDetails();
        Thread.sleep(3000);
        helper.switchToWindow(driver ,1);



        //  Assert.assertTrue(allOrdersPage.orderType.getText().contains("Order Type"));

    }
}
