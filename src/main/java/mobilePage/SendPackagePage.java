package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

public class SendPackagePage extends MobilePageBase {
    public SendPackagePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    private By enterLocationTo = By.id("com.mnasat.nashmi:id/btnEnterDropoffLocation_normal");
    private By writeYourOrderText = By.id("com.mnasat.nashmi:id/etWriteOrder");
    private By serviceFeeValue = By.id("com.mnasat.nashmi:id/tvDeliveryFeePackage");
    private By orderPhoto = By.id("com.mnasat.nashmi:id/iv_send_thing");
    private By selectCamera = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView");
    private By capturePhoto = By.id("com.sec.android.app.camera:id/normal_center_button");
    private By okButton = By.id("com.sec.android.app.camera:id/okay");
    private By nextButton = By.id("com.mnasat.nashmi:id/btnSubmitOrderPackage");
    private By switchLocationIcon = By.id("com.mnasat.nashmi:id/iv_switch_locations_normal");
    private By selectMySavedLocationsBtn = By.id("com.mnasat.nashmi:id/btnFavsList");
    private By selectCurrentLocation = By.id("com.mnasat.nashmi:id/cl_pick_current_location");
    private By selectChooseOnMapBtn = By.id("com.mnasat.nashmi:id/btnChooseOnMap");
    private By doneBtnOnMap = By.id("com.mnasat.nashmi:id/button_done");
    private By pinIcon = By.id("com.mnasat.nashmi:id/ivPin");

    public void clickEnterLocationTo() {
        driver.findElement(enterLocationTo).click();

    }

    public void clickChooseOnMapBtn() {
        driver.findElement(selectChooseOnMapBtn).click();
    }

    public void movePinOnMap() throws InterruptedException {
        Thread.sleep(300);
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(542 , 1206)).moveTo(PointOption.point(1011 ,737)).release().perform();

    }

    public void clickDoneBtnOnMap() {
        driver.findElement(doneBtnOnMap).click();
    }

    public void sendOrderText() {
        driver.findElement(writeYourOrderText).sendKeys("Chipsy");
    }

    public String getServiceFee() {
        return driver.findElement(serviceFeeValue).getText();
    }

    public void clickNextBtn() {

        driver.findElement(nextButton).click();
    }

    public void clickOrderPhoto() {
        driver.findElement(orderPhoto).click();
    }

    public void clickCameraOption() {
        driver.findElement(selectCamera).click();
    }

    public void clickCapturePhotoBtn() {
        driver.findElement(capturePhoto).click();
    }

    public void clickOkBtn() {
        driver.findElement(okButton).click();
    }

}
