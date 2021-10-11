package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn extends BasePage  {
    String SITE_URL = "https://mail.ru";
    String username = "example-21";
    String password = "Niceday123";


    public LogIn(WebDriver driver) {
        super(driver);
    }


    public void LogInMail(){
        goTo(SITE_URL);
        click(By.xpath("//input[@autocomplete=\"username\"]"));
        sendKeys(By.xpath("//input[@autocomplete=\"username\"]"), username);
        click(By.xpath("//button[@data-testid=\"enter-password\"]"));
        click(By.xpath("//input[@class = \"password-input svelte-1tib0qz\"]"));
        sendKeys(By.xpath("//input[@class = \"password-input svelte-1tib0qz\"]"), password);
        click(By.xpath("//button[@data-testid=\"login-to-mail\"]"));
    }
}
