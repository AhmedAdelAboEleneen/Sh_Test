package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CartScreenPage extends MobilePageBase{
   public String TotalPrice;
    public CartScreenPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.mnasat.nashmi:id/cl_proceed_checkout")
    private MobileElement checkoutBtn;
    @AndroidFindBy (id = "com.mnasat.nashmi:id/textView")
    public MobileElement totalPrice;

    //operations

    public void clickCheckout(){
        checkoutBtn.click();

    }

    public String getTotalPrice (){
         TotalPrice = totalPrice.getText();
        System.out.println(TotalPrice);

        return TotalPrice;

    }
}
