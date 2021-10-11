package Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.DeleteMessages;
import page.LogIn;
import page.SendMessage;

import java.util.concurrent.TimeUnit;


public class TestBase  {


   public WebDriver driver;
   public LogIn login;
   public SendMessage sendMessage;
   public DeleteMessages deleteMessages;


    @BeforeEach
    public void start() {
        System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\drivers\\chromedriver94.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login = PageFactory.initElements(driver, LogIn.class);
        sendMessage = PageFactory.initElements(driver, SendMessage.class);
        deleteMessages = PageFactory.initElements(driver, DeleteMessages.class);

    }

    @AfterEach
    public void finish() {
        driver.quit();
    }


}
