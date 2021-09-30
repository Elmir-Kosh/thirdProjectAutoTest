import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) {
        String username = "example-21";
        String password = "Niceday123";
        String adress = "example-21@mail.ru";
        System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.ru");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


            WebElement usernameInput = driver.findElement(By.xpath("//input[@autocomplete=\"username\"]"));
            usernameInput.click();
            usernameInput.sendKeys(username);
            WebElement passwordButton = driver.findElement(By.xpath("//button[@data-testid=\"enter-password\"]"));
            passwordButton.click();
            WebElement passwordInput = driver.findElement(By.xpath("//input[@class = \"password-input svelte-1tib0qz\"]"));
            passwordInput.click();
            passwordInput.sendKeys(password);
            WebElement entryButton = driver.findElement(By.xpath("//button[@data-testid=\"login-to-mail\"]"));
            entryButton.click();

           WebElement newMessage = driver.findElement(By.xpath("//span[@class=\"compose-button__txt\"]"));
           newMessage.click();
           WebElement inputAdress = driver.findElement((By.xpath("//input[@class=\"container--H9L5q size_s--3_M-_\"]")));
           inputAdress.sendKeys(adress);
           WebElement sendMessageButton = driver.findElement(By.xpath("//span[@tabindex=\"570\"]"));
           sendMessageButton.click();
           WebElement sendMessageButtonSure = driver.findElement(By.xpath("//span[contains(text(), 'Отправить')]"));
           sendMessageButtonSure.click();
           WebElement closeMessageAboutSendMessage = driver.findElement(By.xpath("//span[@tabindex=\"1000\"]"));
           closeMessageAboutSendMessage.click();
        WebElement checkMessage2 = driver.findElement(By.xpath("//span[@class=\"mt-a__checkbox\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(checkMessage2).build().perform();
        checkMessage2.click();
           WebElement buttonDeleteMessage = driver.findElement(By.xpath("//span[@class=\"button2 button2_has-ico button2_has-ico-s button2_delete button2_pure button2_ico-text-top button2_hover-support js-shortcut\"]"));
           buttonDeleteMessage.click();
           WebElement clearButton = driver.findElement(By.xpath("//span[@class=\"button2 button2_base button2_primary button2_fluid button2_hover-support\"]"));
           clearButton.click();driver.quit();

    }
}
