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
public class LogInWithInputInvalidPasswordPressedRadioButtonPhone {

    public static void logInWithInputInvalidPassword1()   //Ннажата радио кнопка Телефон

    {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dns-shop.ru/");
        driver.manage().deleteAllCookies(); //удалить куки

        //Найти и нажать кнопку Войти
        WebElement searchButton = driver.findElement(By.cssSelector("a#loginButton.dropdown-toggle"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Найти и нажать радио кнопку телефон
        WebElement searchRadioButton = driver.findElement(By.xpath(".//*[@id='login-form']/div[2]/div[3]/label"));
        searchRadioButton.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Найти поле логин и ввести корректное значение незарегестрированного пользователя
        WebElement searchField = driver.findElement(By.cssSelector("input#login.first.placeholder-right"));
        searchField.clear();
        searchField.sendKeys("9270734545");

        // Найти поле пароль и ввести корректное значение незарегестрированного пользователя
        WebElement searchField2 = driver.findElement(By.cssSelector("input#password.second"));
        searchField2.clear();
        searchField2.sendKeys("123");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

       //Нажать кнопку Войти
         WebElement searchButtonEnter = driver.findElement(By.cssSelector("input#login-btn.btn.active-btn"));
        searchButtonEnter.click();

        //Поиск сообщения об ошибке
        WebElement searchFieldError2 = driver.findElement(By.cssSelector("div.error"));
        String strng2 = searchFieldError2.getText();
        Assert.assertEquals("Ошибка! Неправильная пара логин или пароль", strng2);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.quit();
    }
}