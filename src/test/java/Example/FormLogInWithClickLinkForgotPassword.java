package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Created by Администратор on 17.04.2017.
 */
public class FormLogInWithClickLinkForgotPassword {
    public static void formlogInWithClickLinkForgotPassword1() // проверка нажататия на "Забыли пароль?"

    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dns-shop.ru/");
        driver.manage().deleteAllCookies();

        //Нажать кнопку Войти
        WebElement searchButton = driver.findElement(By.cssSelector("a#loginButton.dropdown-toggle"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        // Поиск элемента и сравнение на какой сайт перешел после нажатия
        WebElement searchField = driver.findElement(By.xpath(".//*[@id='login-form']/div[4]/a"));
        searchField.click();
        driver.getCurrentUrl();
        Assert.assertEquals("https://accounts.dns-shop.ru/recovery", "https://accounts.dns-shop.ru/recovery");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.quit();
    }
}
