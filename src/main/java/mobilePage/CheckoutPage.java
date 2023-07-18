package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class CheckoutPage extends MobilePageBase{
    public String OrderPrice;
    public String DeliveryFee;
    public String TotalAmount;
    public String DeliveryFeeBeforeDiscount;
    public CheckoutPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    private MobileElement cashCheckBtn;


    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.Button")
    private MobileElement placeOrderBtn;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
    private MobileElement placeOrderBt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/tv_price_before_discount")
    public MobileElement orderPrice;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/tvDeliveryFee")
    private MobileElement deliveryFee;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/tv_delivery_before_discount")
    private MobileElement deliveryFeeBeforeDiscount;

    @AndroidFindBy(id = "com.mnasat.nashmi:id/tv_total_price")
    private MobileElement totalPrice;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/pay_first_flow")
    private MobileElement placeOrderBtnPharmacy;

  //  public MobileElement paymentMethods = (MobileElement) driver.findElements(By.id("com.mnasat.nashmi:id/rv_payment"));





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

    //for Supermarket TotalPrice
    public void getTotalAmount (){
        TotalAmount = totalPrice.getText();
        System.out.println(TotalAmount);

    }

   //for Supermarket place order
    public void placeSupermarketOrder (){
        placeOrderBt.click();

    }

    public void clickplaceOrderBtnPharmacy(){
        placeOrderBtnPharmacy.click();
    }

}
