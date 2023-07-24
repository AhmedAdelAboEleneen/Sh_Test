package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

public class ServeYouPage extends MobilePageBase{
    public ServeYouPage(AppiumDriver<MobileElement> driver) {
        super (driver);
    }

    public String DeliveryFeeOfService;

    private By serveYou= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.ImageView");
    private  By carWashingService= By.id("iv_car_wash");

    private By submitButtonServeYou= By.id("btnCheckoutServe");

    private By detailsService =By.id("etWriteOrder");

    private By servicePrice= By.id("et_add_fees");
    private By ApplyPrice= By.id("btnCheckoutServe");
    private By ServeYouCheckoutButton= By.id("btnSubmitOrderPackage");



     public void clickServeYou(){
         driver.findElement(serveYou).click();

     }

     public void clickcarWashingService(){
         driver.findElement(carWashingService).click();
     }

    public void clickSubmitButton(){
      driver.findElement( submitButtonServeYou).click();

    }

    public void enterDetails(String details){
       driver.findElement(detailsService).click();
       driver.findElement(detailsService).sendKeys(details);
    }

    public void enterServicePrice(String ServicePrice){
      driver.findElement(servicePrice).click();
      driver.findElement(servicePrice).sendKeys(ServicePrice);

    }

    public void clickApply(){
         driver.findElement(ApplyPrice).click();
    }

    public void clickCheckOutService(){
        driver.findElement(ServeYouCheckoutButton).click();
    }




}
