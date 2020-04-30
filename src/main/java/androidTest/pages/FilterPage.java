package androidTest.pages;

import androidTest.driver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FilterPage {
    public void openFilterPage(){
        WebElement openPage = AndroidDriverInstance.androidDriver.findElement(By.id("menu_filter"));
        openPage.click();
    }
    public void activeFilter(){
        WebElement openPage = AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView\n"));
        openPage.click();
    }
    public void completeFilter(){
        WebElement openPage = AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView"));
        openPage.click();
    }
}
