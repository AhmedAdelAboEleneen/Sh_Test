package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PharmacyPage extends MobilePageBase{

    public PharmacyPage(AppiumDriver<MobileElement> driver) {super(driver);}
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.ImageView" )
    private MobileElement pharmacyIndustryBt;

    @AndroidFindBy(id = "com.mnasat.nashmi:id/cover")
    private MobileElement nearestPharmacyCover;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")
    private MobileElement pharmacyFirstBrandBt;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView[3]")
    private MobileElement addBt;

    @AndroidFindBy(id = "com.mnasat.nashmi:id/price")
    private MobileElement orderPriceBt;

    @AndroidFindBy(id = "com.mnasat.nashmi:id/tvProceed")
    private MobileElement checkoutBt;

    @AndroidFindBy(id = "com.mnasat.nashmi:id/tvLessThan100")
    private MobileElement lessThan100Bt;

    @AndroidFindBy(id = "com.mnasat.nashmi:id/confirm")
    private MobileElement confirmBt;


    //Operations
    public void clickpharmacyIndustryBt(){
        pharmacyIndustryBt.click();
    }

    public void clickNearestPharmacyCover (){
        nearestPharmacyCover.click();
    }

    public void clickPharmacyFirstBrand(){
        pharmacyFirstBrandBt.click();
    }

    public void clickAddButton(){
        addBt.click();
    }

    public void openOrderPriceList(){
        orderPriceBt.click();
    }

    public void clickCheckoutBtn(){
        checkoutBt.click();
    }

    public void clickLessThan100(){
        lessThan100Bt.click();
    }

    public void clickConfirmBtn(){
        confirmBt.click();
    }

}
