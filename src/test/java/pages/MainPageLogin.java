package pages;

import org.openqa.selenium.By;


public class MainPageLogin extends BasePage {
    public static final String SITE_URL = "https://mail.ru";
    public static final String username = "example-21";
    public static final String password = "Niceday123";
    public static final String usernameFIELD = "//input[@autocomplete=\"username\"]";
    public static final String enterPasswordBUTTON = "//button[@data-testid=\"enter-password\"]";
    public static final String inputPasswordFIELD = "//input[@class = \"password-input svelte-1tib0qz\"]";
    public static final String enterBUTTON = "//button[@data-testid=\"login-to-mail\"]";

     public MainPageLogin mainPageEntryLogin(){
         goTo(SITE_URL);
         click(By.xpath(usernameFIELD));
         sendKeys(By.xpath(usernameFIELD), username);
         click(By.xpath(enterPasswordBUTTON));
         return this;
     }

     public MainPageLogin mainPageEntryPassword(){
         click(By.xpath(inputPasswordFIELD));
         sendKeys(By.xpath(inputPasswordFIELD), password);
         click(By.xpath(enterBUTTON));
         return this;
     }

}
