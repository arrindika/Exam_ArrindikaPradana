package androidTest.pages;

import androidTest.driver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UncheckToDoPage {

    public void clickUncheck(String id){
        WebElement openPage = AndroidDriverInstance.androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout["+id+"]/android.widget.CheckBox"));
        openPage.click();
    }
    public void checkdone(){
        String openPage = AndroidDriverInstance.androidDriver.findElement(By.id("complete")).getAttribute("checked");
        boolean cek = Boolean.valueOf(openPage);
    }
}
