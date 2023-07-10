package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FoodCartPage extends MobilePageBase{
   public String TotalPrice;
    public FoodCartPage(AppiumDriver<MobileElement> driver) {
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

    public void getTotalPrice (){
         TotalPrice = totalPrice.getText();
        System.out.println(TotalPrice);

    }
}
