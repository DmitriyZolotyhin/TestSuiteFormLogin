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
public class LogInLogOut {
    public static void logInLogOut1()

    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dns-shop.ru/");

        //Поиск  и ввод кнопки login
        WebElement searchButton = driver.findElement(By.cssSelector("a#loginButton.dropdown-toggle"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        //Поиск поля Email и ввод корректного значения
        WebElement searchField = driver.findElement(By.cssSelector("input#login.first.placeholder-right"));
        searchField.clear();
        searchField.sendKeys("ivantest2017q@yandex.ru");

        //Поиск поля Пароль и ввод корректного значения
        WebElement searchField2 = driver.findElement(By.cssSelector("input#password.second"));
        searchField2.clear();
        searchField2.sendKeys("samara123");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        //Нажать кнопку Войти
        WebElement searchButtonEnter = driver.findElement(By.cssSelector("input#login-btn.btn.active-btn"));
        searchButtonEnter.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Проверка наличия текста в определенном пути:ivantest2017q@yandex.ru
        driver.findElement(By.xpath(".//*[@id='header-profiler']/li[2]/a")).getText().contains("ivantest2017q@yandex.ru");

        //Нажать на меню
        WebElement searchElement = driver.findElement(By.cssSelector("i.icon-user"));
        searchElement.click();

        //Выход из учетной записи
        WebElement searchElement2 = driver.findElement(By.xpath("//span[contains(@class,'icon-logout')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", searchElement2);

        //Проверка,после выхода появилась ли кнопка Войти
        WebElement elementButtonEnterLogin = driver.findElement(By.id("loginButton"));
        String strng2 = elementButtonEnterLogin.getText();
        Assert.assertEquals("Войти", strng2);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.quit();


    }
}
