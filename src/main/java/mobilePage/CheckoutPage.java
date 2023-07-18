package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class CheckoutPage extends MobilePageBase{
    public static String TotalAmount;
    public String OrderPrice;
    public static String DeliveryFee;
    public String DeliveryFeeBeforeDiscount;
    public CheckoutPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    private MobileElement cashCheckBtn;


    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.Button")
    private MobileElement placeOrderBtn;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/tv_price_before_discount")
    public MobileElement orderPrice;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/tvDeliveryFee")
    private MobileElement deliveryFee;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/tv_delivery_before_discount")
    private MobileElement deliveryFeeBeforeDiscount;


    //operations

    public void checkCashPaymentMethod (){
        cashCheckBtn.click();

    }

    public void clickPlaceOrder (){
        placeOrderBtn.click();

    }

    public void getOrderPrice (){
        OrderPrice = orderPrice.getText();
        System.out.println(OrderPrice);

    }

    public void getDeliveryFee (){
        DeliveryFee = deliveryFee.getText();
        System.out.println(DeliveryFee);

    }

    public void getDeliveryFeeBeforeDiscount (){
        DeliveryFeeBeforeDiscount = deliveryFeeBeforeDiscount.getText();
        System.out.println(DeliveryFeeBeforeDiscount);

    }

    public void getTotalAmount(){
        MobileElement totalAmount = driver.findElement(By.id("com.mnasat.nashmi:id/tv_total_price"));
        TotalAmount = totalAmount.getText();
    }


}
