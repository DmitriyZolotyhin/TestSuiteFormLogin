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
public class FormLogInWithClickLinkImageDns4 {
    public static void formlogInWithClickLinkImageDns4_4()

    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dns-shop.ru/");

        //Нажать кнопку Войти
        WebElement searchButton = driver.findElement(By.cssSelector("a#loginButton.dropdown-toggle"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        // Поиск элемента и сравнение на какой сайт перешел после нажатия
        WebElement searchField = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div[4]/a/div"));
        searchField.click();
        driver.getCurrentUrl();
        Assert.assertEquals("http://service.dns-shop.ru/", "http://service.dns-shop.ru/");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.quit();


    }
}