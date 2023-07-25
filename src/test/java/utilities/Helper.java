package utilities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;


import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static webTest.WebTestBase.driver;

public class Helper {
    private static Helper scrollDown = null;
    private JavascriptExecutor js;

    private Helper() {
        js = (JavascriptExecutor) driver;
    }

    public static synchronized Helper getInstance() {
        if (scrollDown == null)
            scrollDown = new Helper();

        return scrollDown;
    }
    public void scrollDown() {
        js.executeScript("scrollBy(0,500)");
    }

    public void scrollToTheWebBottom(WebDriver driver) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }


    public void scrollDownIntoWebView(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public WebElement scrollDownIntoMobileView(AndroidDriver driver, String text) {
        return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(" + text + ").instance(0))");

    }





    public void zoomOut() {
        js.executeScript("document.body.style.zoom='70%'");
    }
    
    // Method to take screen shoot when test case fail
    public static void caputreScreenShoot(WebDriver driver, String screenShootName) {
        Path dest = Paths.get("./ScreenShoot/ScreenShoot" + screenShootName + ".png");
        try {
            java.nio.file.Files.createDirectories(dest.getParent());
            FileOutputStream out = new FileOutputStream(dest.toString());
            out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            out.close();
        } catch (IOException e) {
            System.out.println("Excpetion while take screen shoot" + e.getMessage());
        }
    }
            public void switchToWindow(WebDriver driver, int windowIndex) {
            List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(windowHandles.get(windowIndex));
        }
    }
