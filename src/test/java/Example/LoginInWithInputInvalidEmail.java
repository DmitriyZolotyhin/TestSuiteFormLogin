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
public class LoginInWithInputInvalidEmail {



    public static void logInWithInputInvalidEmal1()
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dns-shop.ru/");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Нажать Войти
        WebElement searchButton = driver.findElement(By.cssSelector("a#loginButton.dropdown-toggle"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        //driver.navigate().refresh();// обновить браузер


        // Поиск поля ввода логин и ввод некорректного значения
        // Найти поле логин и ввести некоректный телефон
        WebElement searchField = driver.findElement(By.cssSelector("input#login.first.placeholder-right"));
        searchField.clear();
        searchField.sendKeys("00");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        // Найти поле пароль и очистить
        WebElement searchField2 = driver.findElement(By.cssSelector("input#password.second"));
        searchField2.clear();

        //Поиск ошибки
        WebElement searchFieldError = driver.findElement(By.cssSelector("div.error"));
        String strng2 = searchFieldError.getText();
        Assert.assertEquals("Некорректный e-mail", strng2);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Найти поле пароль и очистить
        WebElement searchField3 = driver.findElement(By.cssSelector("input#password.second"));
        searchField3.clear();

        //Нажать кнопку Войти
       // WebElement searchButtonEnter2 = driver.findElement(By.cssSelector("input#login-btn.btn.active-btn"));
     //   searchButtonEnter2.click();
        WebElement searchButtonEnter = driver.findElement(By.cssSelector("input#login-btn.btn.active-btn"));
         JavascriptExecutor executor = (JavascriptExecutor) driver;
          executor.executeScript("arguments[0].click();",searchButtonEnter );
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        //Поиск сообщения об ошибке
        WebElement searchFieldError2 = driver.findElement(By.cssSelector("div.error"));
        String strng3 = searchFieldError2.getText();
        Assert.assertEquals("Не все поля заполнены", strng3);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.quit();
    }
}

