package webPage;

import mobilePage.TrackOrderPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class allOrdersPage extends WebPageBase {
    public allOrdersPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "/html/body/app-root/section/div/app-list/div[1]/div[2]/button[2]/span[1]")
    public WebElement advancedSearchBt;

    @FindBy (id= "mat-select-value-1")
    public WebElement orderStatus;

    @FindBy (id = "mat-option-19")
    public WebElement driverAssignedChBox;

    @FindBy (id= "mat-option-20")
    public WebElement pickingUpChBox;

    @FindBy (id = "mat-option-21")
    public WebElement deliveringChBox;

    @FindBy (id= "mat-option-22")
    public WebElement deliveredChBox;

    @FindBy (id = "btn_search")
    public WebElement searchBt;

    @FindBy (css = "#btn_search > span.mat-button-wrapper > i")
    public WebElement detailsView;

    @FindBy (xpath = "/html/body/app-root/section/div/app-order-details/div[2]/div/mat-card/div[3]/div[1]/ul/li[4]")
    public WebElement orderType;

    @FindBy (xpath = "/html/body/app-root/section/div/app-list/div[2]/div/mat-card/form/div[1]/mat-form-field[1]/div/div[1]/div/input")
    public WebElement orderNumberTxt;




  //Operations
  public void openAdvancedSearch (){
      advancedSearchBt.click();

  }

    public void openOrderStatusSection (){
        orderStatus.click();

    }

    public void uncheckDriverAssigned (){
        driverAssignedChBox.click();

    }

    public void uncheckPickingUp (){
        pickingUpChBox.click();

    }

    public void uncheckDelivering (){
        deliveringChBox.click();
        deliveredChBox.sendKeys(Keys.ESCAPE);

    }

    public void checkDelivered (){
        deliveredChBox.click();


    }

    public void clickSearch () throws InterruptedException {
//        Thread.sleep(3000);
//        Actions actions = new Actions(driver);
//        actions.doubleClick(searchBt).perform();
        searchBt.click();

    }

    public void openOrderDetails () throws InterruptedException {
        Thread.sleep(3000);
        detailsView.click();

    }

    public void setOrderNumber (){
        orderNumberTxt.click();
        TrackOrderPage trackOrderPage = null;
        orderNumberTxt.sendKeys(trackOrderPage.OrderNumber);

    }





}
