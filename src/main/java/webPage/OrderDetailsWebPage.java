package webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderDetailsWebPage extends WebPageBase {
    public OrderDetailsWebPage(WebDriver driver) {
        super(driver);
    }

    private By orderNumber = By.id("orderNumber");
    private By deliveryFeeUser = By.id("deliveryAfterDisc");
    private By finalTotal = By.id("detailsFinal");

    public String getOrderNumber(WebDriver driver) {
        return driver.findElement(orderNumber).getText();
    }

    public String getDeliveryFeeUser(WebDriver driver) {
        return driver.findElement(deliveryFeeUser).getText();
    }

    public String getFinalTotal(WebDriver driver) {
        return driver.findElement(finalTotal).getText();

    }
}
