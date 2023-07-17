package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.Select;

public class SupermarketPage extends MobilePageBase{

    public String SupermarketDeliveryFee;
    public SupermarketPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout")
    private MobileElement nearestSupermarket;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/tvDeliveryFee")
    private MobileElement DeliveryFee;

    @AndroidFindBy (xpath = "//androidx.recyclerview.widget.RecyclerView[1]/android.widget.FrameLayout[1]")
    private MobileElement fristBrand;

    @AndroidFindBy (xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView[3]")
    private MobileElement addItemBt1;

    @AndroidFindBy (xpath = "//android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView[3]")
    private MobileElement addItemBt2;

    @AndroidFindBy (xpath = "//android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.TextView[3]")
    private MobileElement addItemBt3;

    @AndroidFindBy (xpath = "//android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.TextView[3]")
    private MobileElement addItemBt4;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/layout_cart_counter")
    private MobileElement supermarketCart;



    @AndroidFindBy (id = "com.mnasat.nashmi:id/text_view_add")
    private MobileElement incrementBt;

    //Operations

    public void openNearestSupermarket (){
        nearestSupermarket.click();
    }

    public void selectFirstBrand (){
     fristBrand.click();

    }

    public void addOneItem (){
        addItemBt1.click();

    }

    public void increaseItem (){
        incrementBt.click();
        incrementBt.click();
        incrementBt.click();
        incrementBt.click();


    }

    public void addOTwoItems (){
        addItemBt2.click();

    }

    public void addThreeItems (){
        addItemBt3.click();

    }

    public void addFourItems (){
        addItemBt4.click();

    }

    public void openCart (){
        supermarketCart.click();

    }
    public void getDeliveryFee (){
        SupermarketDeliveryFee = DeliveryFee.getText();
        System.out.println(SupermarketDeliveryFee);

    }


}
