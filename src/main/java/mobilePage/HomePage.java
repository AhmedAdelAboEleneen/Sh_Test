package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class HomePage extends MobilePageBase{
    public HomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public String DeliveryFee;
    By sendPackageIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.TextView");
    @AndroidFindBy (id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private MobileElement enableLocationBt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/btnConfirm")
    private MobileElement confirmSimilarLocationBt;

    @AndroidFindBy (id = "tv_search_main")
    private MobileElement searchBarBt;

    @AndroidFindBy (id ="android:id/search_src_text" )
    private MobileElement searchTxt;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    private MobileElement firstResult;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    private MobileElement firstStore;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/btn_submit")
    private MobileElement nextBt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/etStoreName")
    private MobileElement storeNameTxt;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/btn_submit")
    private MobileElement confirmBt;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout")
    private MobileElement storeCard;

    @AndroidFindBy (id = "com.mnasat.nashmi:id/tvPrice")
    private MobileElement orderDeliveryFee;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]")
    private MobileElement supermarketIndustry;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private MobileElement allowNotificationBt;



    //operations
    public void enableAppLocation(){
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        enableLocationBt.click();

    }

    public void confirmSimilarLocation(){
        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
        confirmSimilarLocationBt.click();

    }

    public void clickSearchBar(){
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        searchBarBt.click();

    }

    public void enterPickUpLocation(String pickupLocation){
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        searchTxt.sendKeys(pickupLocation);

    }

    public void selectFirstResult (){
        firstResult.click();
    }

    public void selectFirstStore (){
        firstStore.click();
    }

    public void clickNextButton (){
        nextBt.click();

    }


    public void enterStoreName(String StoreName){
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        storeNameTxt.sendKeys(StoreName);

    }

    public void clickConfirmButton (){
        confirmBt.click();

    }

    public void getOrderDeliveryFee(){
        DeliveryFee = orderDeliveryFee.getText();
        System.out.println(DeliveryFee);

    }

    public void openSupermarket (){
        supermarketIndustry.click();

    }

    public void clickAllowNotification(){
        allowNotificationBt.click();
    }
    public void selectSendPackage() {

        //TouchAction action = new TouchAction(driver);
        //action.longPress(PointOption.point(153 , 517)).moveTo(PointOption.point(931 ,534)).release().perform();


        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.mnasat.nashmi:id/rvIndustries\")).setAsHorizontalList().scrollIntoView("
                        + "new UiSelector().descriptionContains(\"Send Package\"))"));
        driver.findElement(sendPackageIcon).click();
    }
}
