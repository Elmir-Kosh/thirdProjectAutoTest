package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import page.BasePage;


public class Tests extends BasePage {
    String SITE_URL = "https://mail.ru";
    String username = "example-21";
    String password = "Niceday123";
    String adress = "example-21@mail.ru";




    @Test
    public void autoLog() {
        goTo(SITE_URL);
        click(By.xpath("//input[@autocomplete=\"username\"]"));
        sendKeys(By.xpath("//input[@autocomplete=\"username\"]"), username);
        click(By.xpath("//button[@data-testid=\"enter-password\"]"));
        click(By.xpath("//input[@class = \"password-input svelte-1tib0qz\"]"));
        sendKeys(By.xpath("//input[@class = \"password-input svelte-1tib0qz\"]"), password);
        click(By.xpath("//button[@data-testid=\"login-to-mail\"]"));
    }

    @Test
    public void autoSendMessge(){
        goTo(SITE_URL);
        click(By.xpath("//input[@autocomplete=\"username\"]"));
        sendKeys(By.xpath("//input[@autocomplete=\"username\"]"), username);
        click(By.xpath("//button[@data-testid=\"enter-password\"]"));
        click(By.xpath("//input[@class = \"password-input svelte-1tib0qz\"]"));
        sendKeys(By.xpath("//input[@class = \"password-input svelte-1tib0qz\"]"), password);
        click(By.xpath("//button[@data-testid=\"login-to-mail\"]"));
        click(By.xpath("//span[@class=\"compose-button__txt\"]"));
        sendKeys((By.xpath("//input[@class=\"container--H9L5q size_s--3_M-_\"]")), adress);
        click(By.xpath("//span[@tabindex=\"570\"]"));
        click(By.xpath("//span[contains(text(), 'Отправить')]"));
        click(By.xpath("//span[@tabindex=\"1000\"]"));
    }

    @Test
    public void deleteMessages(){
        goTo(SITE_URL);
        click(By.xpath("//input[@autocomplete=\"username\"]"));
        sendKeys(By.xpath("//input[@autocomplete=\"username\"]"), username);
        click(By.xpath("//button[@data-testid=\"enter-password\"]"));
        click(By.xpath("//input[@class = \"password-input svelte-1tib0qz\"]"));
        sendKeys(By.xpath("//input[@class = \"password-input svelte-1tib0qz\"]"), password);
        click(By.xpath("//button[@data-testid=\"login-to-mail\"]"));
        click(By.xpath("//span[@class=\"compose-button__txt\"]"));
        sendKeys((By.xpath("//input[@class=\"container--H9L5q size_s--3_M-_\"]")), adress);
        click(By.xpath("//span[@tabindex=\"570\"]"));
        click(By.xpath("//span[contains(text(), 'Отправить')]"));
        click(By.xpath("//span[@tabindex=\"1000\"]"));
        Actions actions = new Actions(driver);
        WebElement checkMessage2 = driver.findElement(By.xpath("//span[@class=\"mt-a__checkbox\"]"));
        actions.moveToElement(checkMessage2).build().perform();
        click(By.xpath("//span[@class=\"mt-a__checkbox\"]"));
        click(By.xpath("//span[@class=\"button2 button2_has-ico button2_has-ico-s button2_delete button2_pure button2_ico-text-top button2_hover-support js-shortcut\"]"));
        click(By.xpath("//span[@class=\"button2 button2_base button2_primary button2_fluid button2_hover-support\"]"));
    }
}





