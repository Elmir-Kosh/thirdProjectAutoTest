package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class DeleteMessages extends BasePage{
    public DeleteMessages(WebDriver driver) {
        super(driver);
    }

    public SendMessage sendMessage;
    public void deleteMessages(){
        sendMessage = PageFactory.initElements(driver, SendMessage.class);
        sendMessage.sendMessage();
        Actions actions = new Actions(driver);
        WebElement checkMessage2 = driver.findElement(By.xpath("//span[@class=\"mt-a__checkbox\"]"));
        actions.moveToElement(checkMessage2).build().perform();
        click(By.xpath("//span[@class=\"mt-a__checkbox\"]"));
        click(By.xpath("//span[@class=\"button2 button2_has-ico button2_has-ico-s button2_delete button2_pure button2_ico-text-top button2_hover-support js-shortcut\"]"));
        click(By.xpath("//span[@class=\"button2 button2_base button2_primary button2_fluid button2_hover-support\"]"));


    }
}
