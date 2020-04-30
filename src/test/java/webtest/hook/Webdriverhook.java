package webtest.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import webTest.webdriver.Webdriverinstance;

public class Webdriverhook {
    @Before(value = "@Web")
    public void initializeWebdriver(){
        Webdriverinstance.initialize();
    }

    @After(value = "@Web")
    public void quitWebdriver(){
        Webdriverinstance.quit();
    }
}
