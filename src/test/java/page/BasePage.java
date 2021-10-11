package page;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertTrue;


@Slf4j
public class BasePage {
    public String SITE_URL;
    public String username;
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    //Wai Wrapper Method
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //goTo Method
    public void goTo(String SITE_URL){
        driver.get(SITE_URL);

    }

    //Click Method
    public void click(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    //sendKeys Method
    public void sendKeys(By elementBy, String username){
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(username);
    }

    //is Element Displayed
    public void isElementDisplayed(By elementBy){
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }
}
