package mobilePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SplashPage extends MobilePageBase {


    public SplashPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy (id = "com.mnasat.nashmi:id/tvSkip")
    private MobileElement skipBtn;

// operations

    public void clickSkip (){
        skipBtn.click();

    }
    }


