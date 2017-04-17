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

        //Нажать Войти
        WebElement searchButton = driver.findElement(By.cssSelector("a#loginButton.dropdown-toggle"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        // Поиск поля ввода логин и ввод некорректного значения
        WebElement searchField = driver.findElement(By.cssSelector("input#login.first.placeholder-right"));
        searchField.clear();
        searchField.sendKeys("ru");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Поиск и очистка поля ввода пароль
        WebElement searchField2 = driver.findElement(By.cssSelector("input#password.second"));
        searchField2 .click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Поиск сообщения об ошибке
       WebElement searchFieldError = driver.findElement(By.cssSelector("div.error"));
     String strng = searchFieldError.getText();
        Assert.assertEquals("Некорректный e-mail", strng);
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        // Нажатие кнопки Войти
      //  WebElement searchButtonEnter = driver.findElement(By.cssSelector("input#login-btn.btn.active-btn"));
      //  JavascriptExecutor executor = (JavascriptExecutor) driver;
      //  executor.executeScript("arguments[0].click();",searchButtonEnter );
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
