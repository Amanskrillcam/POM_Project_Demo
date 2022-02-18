package TestCases;

import Basepackage.BaseTest;
import PageFactory.ObjectFactory;
import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class LoginPageTest extends BaseTest
{
//    ObjectFactory obj;

    public LoginPageTest() {super();}

    @BeforeSuite
    public void setup()
    {
        initialization();
    }

    @BeforeTest
    public void userLoginTest() throws IOException {
        obj.getlogin().userLogin();
    }

    @Test
    public void forgotPasswrdButton()
    {
        obj.getlogin().forgotPass();
    }

    @Test
    public void loginpageTitletest()
    {
       String logintitle= obj.getlogin().ValidateLoginPageTitle();
        Assert.assertEquals(logintitle,"OrangeHRM");
    }

    @AfterSuite
    public void teardown()
    {
        driver.quit();
    }

}
