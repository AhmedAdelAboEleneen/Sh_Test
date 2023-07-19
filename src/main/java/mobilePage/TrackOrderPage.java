package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TrackOrderPage extends MobilePageBase{
    public TrackOrderPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
   public static String OrderNumber;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/android.view.ViewGroup[2]/android.widget.TextView[2]")
    public MobileElement orderNumberTx;


    //operations

    public String getOrderNumber (){

         OrderNumber = orderNumberTx.getText();
        System.out.println(OrderNumber);
        return (OrderNumber);

    }
}