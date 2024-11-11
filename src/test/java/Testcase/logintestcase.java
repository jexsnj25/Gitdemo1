package Testcase;

import base.basetest;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.LoginPage;

public class logintestcase extends basetest {

    @Test
    public void testcase(){
        setup();
        LoginPage loginpage = new LoginPage(page);
        loginpage.navigatetoSignupPage();
        loginpage.enterUsername("Jeckson");
        loginpage.enterEmail("jecksonrusval@gmail.com");
        loginpage.clickonSignUpButton();

    }
}
