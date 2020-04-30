package androidTest.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInstance {
    public static AndroidDriver<AndroidElement> androidDriver;

    public static void initialize(){
        String appiumUrl = "http://127.0.0.1:4723/wd/hub";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("deviceName", "device");
        caps.setCapability("udid", "ce051605e305e41205");
        caps.setCapability("app", "C:\\Users\\Asus\\Downloads\\TodoApp (1).apk");
        caps.setCapability("automationName","UiAutomator2");

        try {
            androidDriver = new AndroidDriver<AndroidElement>(new URL(appiumUrl), caps);
            androidDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public static void quit(){

        androidDriver.quit();
    }
}
