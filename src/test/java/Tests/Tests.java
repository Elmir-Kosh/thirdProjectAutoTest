package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.DeleteMessages;
import pages.MainPageLogin;
import pages.SendMessagePage;


public class Tests extends BasePage {

    MainPageLogin mainPageLogin = PageFactory.initElements(driver, MainPageLogin.class);
    SendMessagePage sendMessagePage = PageFactory.initElements(driver, SendMessagePage.class);
    DeleteMessages deleteMessages = PageFactory.initElements(driver, DeleteMessages.class);


    @Test
    public void autoLog() {
    mainPageLogin.mainPageEntryLogin();
    mainPageLogin.mainPageEntryPassword();
    }

    @Test
    public void autoSendMessage(){
        mainPageLogin.mainPageEntryLogin();
        mainPageLogin.mainPageEntryPassword();
    sendMessagePage.preparedMessageToSend();
    sendMessagePage.enterMessageText();
    sendMessagePage.sendMessage();

    }

    @Test
    public void deleteMessages(){
        mainPageLogin.mainPageEntryLogin();
        mainPageLogin.mainPageEntryPassword();
        sendMessagePage.preparedMessageToSend();
        sendMessagePage.enterMessageText();
        sendMessagePage.sendMessage();
    deleteMessages.moveCursorAndCheckbox();
    deleteMessages.deleteMessages();
    }
}





