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
public class LogInWithOutInputEmail {

    public static void logInWithoutInputEmail1()

    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dns-shop.ru/");

        //Найти и нажать кнопку Войти
        WebElement searchButton = driver.findElement(By.cssSelector("a#loginButton.dropdown-toggle"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Найти и очистить поле логин
        WebElement searchField = driver.findElement(By.cssSelector("input#login.first.placeholder-right"));
        searchField.clear();


        //Найти и ввести корректное значение
        WebElement searchField2 = driver.findElement(By.cssSelector("input#password.second"));
        searchField2.clear();
        searchField2.sendKeys("samara123");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Найти и нажать кнопку Войти
        WebElement searchButtonEnter = driver.findElement(By.cssSelector("input#login-btn.btn.active-btn"));
        searchButtonEnter.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Поиск сообщения об ошибке
        WebElement searchFieldError2 = driver.findElement(By.cssSelector("div.error"));
        String strng2 = searchFieldError2.getText();
        Assert.assertEquals("Не все поля заполнены", strng2);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.quit();


    }


}
