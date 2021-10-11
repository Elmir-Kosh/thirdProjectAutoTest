package Tests;

import org.junit.jupiter.api.Test;


public class Tests extends TestBase{



    @Test
    public void autoLog(){
        login.LogInMail();
    }

    @Test
    public void autoSendMessage(){
        sendMessage.sendMessage();
    }

    @Test
    public void deleteMessage(){
        deleteMessages.deleteMessages();
    }

    }


