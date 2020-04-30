package webTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import webTest.webdriver.Webdriverinstance;

public class HomePage {
    public void openHomePage(){
        Webdriverinstance.driver.get("https://www.google.com");
    }
    public void inputSearch(String keyword){
        WebElement inputSearch = Webdriverinstance.driver.findElement(By.xpath("//input[@name='q']"));
        inputSearch.sendKeys(keyword);
    }
    public void clickSearch(){
        WebElement inputSearch = Webdriverinstance.driver.findElement(By.xpath("//input[@name='q']"));
        inputSearch.sendKeys(Keys.ENTER);
    }
    public void clickFirstResult(){
        WebElement buttonSearch = Webdriverinstance.driver.findElement(By.cssSelector("body.srp.tbo.vasq:nth-child(2) div.big:nth-child(3) div.mw:nth-child(12) div.col:nth-child(2) div.med:nth-child(3) div.g:nth-child(1) div.rc div.r:nth-child(1) a:nth-child(1) > h3.LC20lb.DKV0Md:nth-child(2)"));
        buttonSearch.click();
    }
}
