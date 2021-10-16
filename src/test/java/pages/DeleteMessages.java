package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DeleteMessages extends BasePage{

    String checkBoxMessages = "//span[@class=\"mt-a__checkbox\"]";
    String deleteButton = "//span[@class=\"button2 button2_has-ico button2_has-ico-s button2_delete button2_pure button2_ico-text-top button2_hover-support js-shortcut\"]";
    String deletePrimaryButton = "//span[@class=\"button2 button2_base button2_primary button2_fluid button2_hover-support\"]";


    public void moveCursorAndCheckbox(){
        Actions actions = new Actions(driver);
        WebElement checkMessage2 = driver.findElement(By.xpath(checkBoxMessages));
        actions.moveToElement(checkMessage2).build().perform();
        click(By.xpath(checkBoxMessages));
    }

    public void deleteMessages(){
        click(By.xpath(deleteButton));
        click(By.xpath(deletePrimaryButton));
    }
}
