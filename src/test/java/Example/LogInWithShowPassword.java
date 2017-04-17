package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Администратор on 17.04.2017.
 */
public class LogInWithShowPassword {
    public static void logInWithShowPassword1()

    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dns-shop.ru/");

        //Найти и нажать кнопку Войти
        WebElement searchButton = driver.findElement(By.cssSelector("a#loginButton.dropdown-toggle"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Найти и ввести в поле пароль корректное значение
        WebElement searchField = driver.findElement(By.cssSelector("input#password.second"));
        searchField.clear();
        searchField.sendKeys("samara123");
        //Найти и нажать чекбокс Показать пароль
        WebElement searchField2 = driver.findElement(By.cssSelector(".show-password>span"));
        searchField2.click();

        // Проверка введённого текста в поле пароль
        searchField.getAttribute("samara123");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.quit();


    }
}
