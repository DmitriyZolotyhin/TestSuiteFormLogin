package Example;


import org.testng.annotations.Test;


/**
 * Created by Администратор on 13.04.2017.
 */
public class ExampleTest {

    @Test(groups = {"positive_test"})
    public void logInLogOut()
    {
        LogInLogOut.logInLogOut1();

    }

    @Test(groups = {"negative_test"})
    public void logInWithVoidValue()
    {
        LogInWithVoidValue.logInWithVoidValue1();
    }


    @Test(groups = {"negative_test"})
    public void logInWithoutInputEmail()
    {
        LogInWithOutInputEmail.logInWithoutInputEmail1();
    }


    @Test(groups = {"negative_test"})    //Нажата радио кнопка Email
    public void logInWithoutInputPassword()
    {
        LogInWithOutInputPassword.logInWithoutInputPassword1();
    }


    @Test(groups = {"negative_test"})
    public void logInWithoutInputPhone()
    {
        LoginInWithOutInputPhone.logInWithoutInputPhone1();
    }


    @Test(groups = {"negative_test" })  //Нажата радио кнопка Телефон
    public void logInWithoutInputPasswordPressedRadioButtonPhone()
    {
        LogInWihtOutInputPasswordPreseedRadioButtonPhone.logInWithoutInputPasswordPressedRadioButtonPhone1();
    }


    @Test(groups = {"negative_test"})
    public void logInWithVoidValuePressedRadioButtonPhone()
    {
        LogInWithVoidValuePressedRadioButtonPhone.logInWithVoidValuePressedRadioButtonPhone1();
    }


    @Test(groups = {"negative_test"})
    public void logInWithInputInvalidEmal()
    {
        LoginInWithInputInvalidEmail.logInWithInputInvalidEmal1();
    }


    @Test(groups = {"negative_test"})
    public void logInWithInputInvalidPassword()
    {
        LogInWithInputInvalidPassword.logInWithInputInvalidPassword1();
    }


    @Test(groups = {"negative_test"})  //Нажата радио кнопка Телефон
    public void logInWithInputInvalidPhonePressed()
    {
        LogInWithInputInvalidPhonePressed.logInWithInputInvalidPhonePressed1();
    }


    @Test(groups = {"negative_test"})
    public void logInWithShowPassword()
    {
        LogInWithShowPassword.logInWithShowPassword1();
    }


    @Test(groups = {"positive_test"})
    public void formlogInWithClickLinkImageDns1()
    {
        FormLogInWithClickLinkImageDns1.formlogInWithClickLinkImageDns1();
    }


    @Test(groups = {"positive_test"})
    public void formlogInWithClickLinkImageDns2()
    {
        FormLogInWithClickLinkImageDns2.formlogInWithClickLinkImageDns2_2();
    }


    @Test(groups = {"positive_test"})
    public void formlogInWithClickLinkImageDns3()

    {
        FormlogInWithClickLinkImageDns3.formlogInWithClickLinkImageDns3_3();
    }



    @Test(groups = {"positive_test"})
    public void formlogInWithClickLinkImageDns4()

    {
        FormLogInWithClickLinkImageDns4.formlogInWithClickLinkImageDns4_4();
    }


    @Test(groups = {"positive_test"})
    public void formlogInWithClickLinkForgotPassword() // проверка нажататия на "Забыли пароль?"

    {
        FormLogInWithClickLinkForgotPassword.formlogInWithClickLinkForgotPassword1();
    }


    @Test(groups = {"positive_test"})
    public void formlogInWithClickLinkRegistration() // проверка нажататия на "Регистрация"

    {
        FormLogInWithClickLinkRegistration.formlogInWithClickLinkRegistration1();

    }


    @Test(groups = {"negative_test"})
    public void LogInWithInputInvalidPasswordPressedRadioButtonPhone()

    {
        LogInWithInputInvalidPasswordPressedRadioButtonPhone.logInWithInputInvalidPassword1();

    }

}

