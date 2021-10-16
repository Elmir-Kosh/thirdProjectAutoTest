package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageLogin extends BasePage {
    public static WebDriver driver;
    String SITE_URL = "https://mail.ru";
    String username = "example-21";
    String password = "Niceday123";
    String usernameFIELD = "//input[@autocomplete=\"username\"]";
    String enterPasswordBUTTON = "//button[@data-testid=\"enter-password\"]";
    String inputPasswordFIELD = "//input[@class = \"password-input svelte-1tib0qz\"]";
    String enterBUTTON = "//button[@data-testid=\"login-to-mail\"]";

     public void mainPageEntryLogin(){
         goTo(SITE_URL);
         click(By.xpath(usernameFIELD));
         sendKeys(By.xpath(usernameFIELD), username);
         click(By.xpath(enterPasswordBUTTON));
     }

     public void mainPageEntryPassword(){
         click(By.xpath(inputPasswordFIELD));
         sendKeys(By.xpath(inputPasswordFIELD), password);
         click(By.xpath(enterBUTTON));
     }

}
