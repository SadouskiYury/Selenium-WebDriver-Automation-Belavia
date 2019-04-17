package by.htp.belavia.entity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static by.htp.belavia.driver.WebDriverSingleton.getDriver;

public class Element  {
    private WebElement webElement;
    private WebDriver driver;

    public Element(By xpath) {
        driver=getDriver();
        this.webElement = driver.findElement(xpath);
    }

    public void click(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    public void sendKeys(CharSequence... keysToSend){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        if(webElement.isEnabled()){
            webElement.sendKeys(keysToSend);
        }
    }

    public WebElement getWebElement() {
        return webElement;
    }
}
