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
public class LogInWithInputInvalidPhonePressed {
    public static void logInWithInputInvalidPhonePressed1()//Нажата радио кнопка Телефон

    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dns-shop.ru/");
        driver.manage().deleteAllCookies(); //удалить куки

        //Найти и нажать кнопку Войти
        WebElement searchButton = driver.findElement(By.cssSelector("a#loginButton.dropdown-toggle"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        // Найти и нажать радио кнопку Телефон
        WebElement searchRadioButton = driver.findElement(By.xpath(".//*[@id='login-form']/div[2]/div[3]/label"));
        searchRadioButton.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        // Найти поле логин и ввести некоректный телефон
        WebElement searchField = driver.findElement(By.cssSelector("input#login.first.placeholder-right"));
        searchField.clear();
        searchField.sendKeys("0000000000");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        // Найти поле пароль и очистить
        WebElement searchField2 = driver.findElement(By.cssSelector("input#password.second"));
        searchField2.clear();

        //Поиск ошибки
        WebElement searchFieldError = driver.findElement(By.cssSelector("div.error"));
        String strng2 = searchFieldError.getText();
        Assert.assertEquals("Некорректный номер телефона", strng2);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

         //Найти поле пароль и очистить
        WebElement searchField3 = driver.findElement(By.cssSelector("input#password.second"));
        searchField3.clear();

        //Нажать кнопку Войти
        WebElement searchButtonEnter2 = driver.findElement(By.cssSelector("input#login-btn.btn.active-btn"));
        searchButtonEnter2.click();

        //Поиск сообщения об ошибке
        WebElement searchFieldError2 = driver.findElement(By.cssSelector("div.error"));
        String strng3 = searchFieldError2.getText();
        Assert.assertEquals("Не все поля заполнены", strng3);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.quit();


    }
}
