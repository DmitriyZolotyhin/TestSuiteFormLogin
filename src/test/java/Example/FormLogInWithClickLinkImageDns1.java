package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static javafx.scene.input.DataFormat.URL;

/**
 * Created by Администратор on 17.04.2017.
 */
public class FormLogInWithClickLinkImageDns1 {
    public static void formlogInWithClickLinkImageDns1()

    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dns-shop.ru/");
        driver.manage().deleteAllCookies();

        //Найти и Нажать кнопку Войти
        WebElement searchButton = driver.findElement(By.cssSelector("a#loginButton.dropdown-toggle"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        // Поиск элемента и сравнение на какой сайт перешел после нажатия
        WebElement searchField = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div[1]/a/div"));
        searchField.click();
        driver.getCurrentUrl();//Адрес страницы после нажатия кнопки Элемента

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals( currentUrl , "http://www.dns-shop.ru/");//Сравнение адреса страницы после нажатия кнопки и нужного адреса
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.quit();


    }
}
