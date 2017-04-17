package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

/**
 * Created by Администратор on 13.04.2017.
 */
public class ExampleTest {





    @Test(priority = 1,groups = {"positive_test"})
    public void logInLogOut()
    {
        LogInLogOut.logInLogOut1();

    }

    @Test(priority = 10,groups = {"negative_test"})
    public void logInWithVoidValue()
    {
        LogInWithVoidValue.logInWithVoidValue1();
    }


    @Test(priority = 9,groups = {"negative_test"})
    public void logInWithoutInputEmail()
    {
        LogInWithOutInputEmail.logInWithoutInputEmail1();
    }


    @Test(priority = 8,groups = {"negative_test"})   //Нажата радио кнопка Email
    public void logInWithoutInputPassword()
    {
        LogInWithOutInputPassword.logInWithoutInputPassword1();
    }


    @Test(priority = 7,groups = {"negative_test"})
    public void logInWithoutInputPhone()
    {
        LoginInWithOutInputPhone.logInWithoutInputPhone1();
    }


    @Test(priority = 6 ,groups = {"negative_test" })//Нажата радио кнопка Телефон
    public void logInWithoutInputPasswordPressedRadioButtonPhone()
    {
        LogInWihtOutInputPasswordPreseedRadioButtonPhone.logInWithoutInputPasswordPressedRadioButtonPhone1();
    }


    @Test(priority = 10,groups = {"negative_test"})
    public void logInWithVoidValuePressedRadioButtonPhone()
    {
        LogInWithVoidValuePressedRadioButtonPhone.logInWithVoidValuePressedRadioButtonPhone1();
    }


    @Test(priority = 2 ,groups = {"negative_test"})
    public void logInWithInputInvalidEmal()
    {
        LoginInWithInputInvalidEmail.logInWithInputInvalidEmal1();
    }


    @Test(priority = 4,groups = {"negative_test"})
    public void logInWithInputInvalidPassword()
    {
        LogInWithInputInvalidPassword.logInWithInputInvalidPassword1();
    }


    @Test(priority = 5,groups = {"negative_test"})  //Нажата радио кнопка Телефон
    public void logInWithInputInvalidPhonePressed()
    {
        LogInWithInputInvalidPhonePressed.logInWithInputInvalidPhonePressed1();
    }


    @Test(priority = 11,groups = {"negative_test"})
    public void logInWithShowPassword()
    {
        LogInWithShowPassword.logInWithShowPassword1();
    }


    @Test(priority = 12,groups = {"positive_test"})
    public void formlogInWithClickLinkImageDns1()
    {
        FormLogInWithClickLinkImageDns1.formlogInWithClickLinkImageDns1();
    }


    @Test(priority = 13,groups = {"positive_test"})
    public void formlogInWithClickLinkImageDns2()
    {
        FormLogInWithClickLinkImageDns2.formlogInWithClickLinkImageDns2_2();
    }


    @Test(priority = 14,groups = {"positive_test"})
    public void formlogInWithClickLinkImageDns3()

    {
        FormlogInWithClickLinkImageDns3.formlogInWithClickLinkImageDns3_3();
    }



    @Test(priority = 15,groups = {"positive_test"})
    public void formlogInWithClickLinkImageDns4()

    {
        FormLogInWithClickLinkImageDns4.formlogInWithClickLinkImageDns4_4();
    }


    @Test(priority = 16,groups = {"positive_test"})
    public void formlogInWithClickLinkForgotPassword() // проверка нажататия на "Забыли пароль?"

    {
        FormLogInWithClickLinkForgotPassword.formlogInWithClickLinkForgotPassword1();
    }


    @Test(priority = 17,groups = {"positive_test"})
    public void formlogInWithClickLinkRegistration() // проверка нажататия на "Регистрация"

    {
        FormLogInWithClickLinkRegistration.formlogInWithClickLinkRegistration1();

    }


    @Test(priority = 18,groups = {"negative_test"})
    public void LogInWithInputInvalidPasswordPressedRadioButtonPhone()

    {
        LogInWithInputInvalidPasswordPressedRadioButtonPhone.logInWithInputInvalidPassword1();

    }

}
