package webTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webTest.webdriver.Webdriverinstance;

public class WikipediaPage {
    public String getTitle(){
        WebElement titleArticle = Webdriverinstance.driver.findElement(By.id("firstHeading"));
        String title = titleArticle.getText();
        return title;
    }
    public String getNumber(){
        WebElement titleArticle = Webdriverinstance.driver.findElement(By.xpath("//big//b"));
        String title = titleArticle.getText();
        return title;
    }
}
