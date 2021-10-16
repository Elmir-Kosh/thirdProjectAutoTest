package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendMessagePage extends BasePage{
    String address = "example-21@mail.ru";
    String newMessageBUTTON = "//span[@class=\"compose-button__txt\"]";
    String addresseeFIELD = "//input[@class=\"container--H9L5q size_s--3_M-_\"]";
    String sendMessageBUTTON = "//span[@tabindex=\"570\"]";
    String entryTextMessageFIELD = "//div[@class=\"editable-7ctg cke_editable cke_editable_inline cke_contents_true cke_show_borders\"]";
    String MessageText = "Hello";
    String closePopUpWindowBUTTON = "//span[@tabindex=\"1000\"]";

    public void preparedMessageToSend(){
        click(By.xpath(newMessageBUTTON));
        sendKeys((By.xpath(addresseeFIELD)), address);

    }

    public void enterMessageText(){
        click(By.xpath(entryTextMessageFIELD));
        sendKeys(By.xpath(entryTextMessageFIELD), MessageText);

    }

    public void sendMessage(){
        click(By.xpath(sendMessageBUTTON));
        if (driver.getPageSource().contains(MessageText)){
            click(By.xpath(closePopUpWindowBUTTON));}
        else
            click(By.xpath("//span[contains(text(), 'Отправить')]"));
    }
}
