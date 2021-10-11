package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SendMessage extends BasePage {
    public SendMessage(WebDriver driver) {
        super(driver);
    }

    String adress = "example-21@mail.ru";
    public LogIn login;


    public void sendMessage(){
        login = PageFactory.initElements(driver, LogIn.class);
        login.LogInMail();
        click(By.xpath("//span[@class=\"compose-button__txt\"]"));
        sendKeys((By.xpath("//input[@class=\"container--H9L5q size_s--3_M-_\"]")), adress);
        click(By.xpath("//span[@tabindex=\"570\"]"));
        click(By.xpath("//span[contains(text(), 'Отправить')]"));
        click(By.xpath("//span[@tabindex=\"1000\"]"));
    }

}
