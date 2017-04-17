package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Created by Администратор on 17.04.2017.
 */
public class LogInWithInputInvalidPassword {
    public static void logInWithInputInvalidPassword1()   //Ннажата радио кнопка Email

    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dns-shop.ru/");

        //Нажать кнопку Войти
        WebElement searchButton = driver.findElement(By.cssSelector("a#loginButton.dropdown-toggle"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        //Найти поле и ввести в поле логин корректное значение
        WebElement searchField = driver.findElement(By.cssSelector("input#login.first.placeholder-right"));
        searchField.clear();
        searchField.sendKeys("ivantest2017q@yandex.ru");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Найти поле Пароль и ввести несоответсвующий пользователю пароль
        WebElement searchField2 = driver.findElement(By.cssSelector("input#password.second"));
        searchField2.clear();
        searchField2.sendKeys("3");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Нажать кнопку Войти
        WebElement searchButtonEnter = driver.findElement(By.cssSelector("input#login-btn.btn.active-btn"));
        searchButtonEnter.click();

         //Поиск ошибки
        WebElement searchFieldError = driver.findElement(By.cssSelector("div.error"));
        String strng = searchFieldError.getText();
        Assert.assertEquals("Ошибка! Неправильная пара логин или пароль", strng);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Найти поле Пароль и ввести несоответсвующий пользователю пароль еще раз
        WebElement searchField3 = driver.findElement(By.cssSelector("input#password.second"));
        searchField3.clear();
        searchField3.sendKeys("3");

         // Нажатие кнопки с помошью JavascriptExecutor
        WebElement searchButtonEnter4 = driver.findElement(By.cssSelector("input#login-btn.btn.active-btn"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", searchButtonEnter4);

        //Поиск ошибки
        WebElement searchFieldError2 = driver.findElement(By.cssSelector("div.error"));
        String strng2 = searchFieldError2.getText();
        Assert.assertEquals("Поставте галочку, если вы не робот", strng2);

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.quit();
    }

}
