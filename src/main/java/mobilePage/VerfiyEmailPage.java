package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VerfiyEmailPage extends MobilePageBase{


    public VerfiyEmailPage(AppiumDriver<MobileElement> driver) {super(driver);}

    @AndroidFindBy(id = "com.mnasat.nashmi:id/btn_verify_later")
    private MobileElement verifyLater;

    @AndroidFindBy(id = "com.mnasat.nashmi:id/tv_verify_email")
    private MobileElement VerifyEmailtxt;


    public void clickVerifyLater(){
        verifyLater.click();
    }


}
