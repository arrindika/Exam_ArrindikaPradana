package androidTest.pages;

import androidTest.driver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MoreOptionPage {
    public void clickMoreOption(){
        WebElement openPage = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
        openPage.click();
    }
    public void clickRefresh(){
        WebElement openPage = AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView"));
        openPage.click();
    }
    public void clickClear(){
        WebElement openPage = AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView"));
        openPage.click();
    }
}
