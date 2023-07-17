package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SupermarketCartPage extends MobilePageBase{

    public String TotalDeliveryFee;
    public SupermarketCartPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy (id = "com.mnasat.nashmi:id/textView")
    private MobileElement DeliveryFee;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/cl_proceed_checkout")
    private MobileElement checkoutBt;


    //operations
    public void getDeliveryFee (){
        TotalDeliveryFee = DeliveryFee.getText();
        System.out.println(TotalDeliveryFee);

    }

    public void clickCheckout (){
        checkoutBt.click();

    }

}
