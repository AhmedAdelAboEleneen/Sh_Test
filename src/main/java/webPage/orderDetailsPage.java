package webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class orderDetailsPage extends WebPageBase{
    public orderDetailsPage(WebDriver driver) {
        super(driver);
    }

  public String FinalTotal;
   public String DeliverFeeForUser;
    String window;

   private By finalTotal=By.id("detailsFinal");
    private By deliveryFeeForUser= By.id("deliveryAfterDisc");


    public void getFinalTotalPrice(WebDriver driver){
        FinalTotal=driver.findElement(finalTotal).getText();
        System.out.println("Final Total= " +FinalTotal);
    }

    public void getDeliveryFeeForUser(WebDriver driver){
        DeliverFeeForUser=driver.findElement(deliveryFeeForUser).getText();
        System.out.println("Delivery Fee For User= " + DeliverFeeForUser);

    }

    public void getHandle(WebDriver driver) throws InterruptedException {
        Set<String> window = driver.getWindowHandles();
        System.out.println(window);
        // for each loop
        for (String a : window) {
            // condition to change the focus of selenium
            if (window.equals(a)) {
            } else {
                // to change focus on new window
                driver.switchTo().window(a);
                System.out.println("Convert to new Windows Successfully");
                Thread.sleep(2000);
            }
        }
    }


}
