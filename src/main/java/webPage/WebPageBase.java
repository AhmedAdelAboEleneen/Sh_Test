package webPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class WebPageBase {

    public WebDriver driver;
    public JavascriptExecutor jse;
    public Select select;

    // create constructor
    public WebPageBase(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
}
