package pages;

import org.openqa.selenium.By;


public class SendMessagePage extends BasePage{
    private static final String ADRESS = "example-21@mail.ru";
    private static final String NEW_MESSAGE_BUTTON = "//span[@class=\"compose-button__txt\"]";
    private static final String ADDRESSEE_FIELD = "//input[@class=\"container--H9L5q size_s--3_M-_\"]";
    private static final String SEND_MESSAGE_BUTTON = "//span[@tabindex=\"570\"]";
    private static final String SEND_EMPTY_MESSAGE_BUTTON = "//span[contains(text(), 'Отправить')]";
    private static final String ENTRY_TEXT_MESSAGE_FIELD = "//div[@class=\"editable-7ctg cke_editable cke_editable_inline cke_contents_true cke_show_borders\"]";
    private static final String MESSAGE_TEXT = "Hello";
    private static final String CLOSE_POP_UP_WINDOW_BUTTON = "//span[@tabindex=\"1000\"]";

    public SendMessagePage preparedMessageToSend(){
        click(By.xpath(NEW_MESSAGE_BUTTON));
        sendKeys((By.xpath(ADDRESSEE_FIELD)), ADRESS);
        return this;
    }

    public SendMessagePage enterMessageText(){
        click(By.xpath(ENTRY_TEXT_MESSAGE_FIELD));
        sendKeys(By.xpath(ENTRY_TEXT_MESSAGE_FIELD), MESSAGE_TEXT);
        return this;
    }

    public SendMessagePage sendMessage(){

        if (driver.getPageSource().contains(MESSAGE_TEXT)){
            click(By.xpath(SEND_MESSAGE_BUTTON));
            click(By.xpath(CLOSE_POP_UP_WINDOW_BUTTON));}
        else
            click(By.xpath(SEND_MESSAGE_BUTTON));
            click(By.xpath(SEND_EMPTY_MESSAGE_BUTTON));
        return this;
    }

}
