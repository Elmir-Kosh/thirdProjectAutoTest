package pages;

import org.openqa.selenium.By;


public class MainPageLogin extends BasePage {
    public static final String SITE_URL = "https://mail.ru";
    public static final String USERNAME = "example-21";
    public static final String PASSWORD = "Niceday123";
    public static final String USERNAME_FIELD = "//input[@autocomplete=\"username\"]";
    public static final String ENTER_PASSWORD_BUTTON = "//button[@data-testid=\"enter-password\"]";
    public static final String INPUT_PASSWORD_FIELD = "//input[@class = \"password-input svelte-1tib0qz\"]";
    public static final String ENTER_BUTTON = "//button[@data-testid=\"login-to-mail\"]";

     public MainPageLogin mainPageEntryLogin(){
         goTo(SITE_URL);
         click(By.xpath(USERNAME_FIELD));
         sendKeys(By.xpath(USERNAME_FIELD), USERNAME);
         click(By.xpath(ENTER_PASSWORD_BUTTON));
         return this;
     }

     public MainPageLogin mainPageEntryPassword(){
         click(By.xpath(INPUT_PASSWORD_FIELD));
         sendKeys(By.xpath(INPUT_PASSWORD_FIELD), PASSWORD);
         click(By.xpath(ENTER_BUTTON));
         return this;
     }

}
