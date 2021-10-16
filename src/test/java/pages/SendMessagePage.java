package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendMessagePage extends BasePage{
    public static final String address = "example-21@mail.ru";
    public static final String newMessageBUTTON = "//span[@class=\"compose-button__txt\"]";
    public static final String addresseeFIELD = "//input[@class=\"container--H9L5q size_s--3_M-_\"]";
    public static final String sendMessageBUTTON = "//span[@tabindex=\"570\"]";
    public static final String entryTextMessageFIELD = "//div[@class=\"editable-7ctg cke_editable cke_editable_inline cke_contents_true cke_show_borders\"]";
    public static final String MessageText = "Hello";
    public static final String closePopUpWindowBUTTON = "//span[@tabindex=\"1000\"]";

    public SendMessagePage preparedMessageToSend(){
        click(By.xpath(newMessageBUTTON));
        sendKeys((By.xpath(addresseeFIELD)), address);
        return this;
    }

    public SendMessagePage enterMessageText(){
        click(By.xpath(entryTextMessageFIELD));
        sendKeys(By.xpath(entryTextMessageFIELD), MessageText);
        return this;
    }

    public SendMessagePage sendMessage(){
        click(By.xpath(sendMessageBUTTON));
        if (driver.getPageSource().contains(MessageText)){
            click(By.xpath(closePopUpWindowBUTTON));}
        else
            click(By.xpath("//span[contains(text(), 'Отправить')]"));
        return this;
    }

}
